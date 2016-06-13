package com.compay.xm.notificationdemo.managers;

import android.app.Activity;

import com.compay.xm.notificationdemo.Utilvalidate.UtilValidate;
import com.compay.xm.notificationdemo.constants.ApiConstants;
import com.compay.xm.notificationdemo.holder.ProductNotification;
import com.compay.xm.notificationdemo.webservice.AsyncTaskCallBack;
import com.compay.xm.notificationdemo.webservice.UMEPALAppRestClient;
import com.compay.xm.notificationdemo.webservice.WebResponseConstants;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import java.io.ByteArrayInputStream;

/**
 * Created by vivek on 10/6/16.
 */
public class NotificationManager implements ApiConstants {
    ProductNotification notificationHolderObj;
    private static final String TAG = NotificationManager.class.getSimpleName();
    private static NotificationManager notificationManagerInstace = null;
    NotificationManager notificationManager;
    public static NotificationManager getInstance() {

        if (notificationManagerInstace == null) {
            notificationManagerInstace = new NotificationManager();
        }
        return notificationManagerInstace;
    }
    public void getAllNotifications(final Activity activity, final AsyncTaskCallBack asyncTaskCallBack, String session_id){

        RequestParams requestParams=new RequestParams();
        requestParams.put(NotificationRequestParams.NOTIFICATION_URL,session_id);

        UMEPALAppRestClient.get(NotificationRequestParams.NOTIFICATION_URL, requestParams, null, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                String response= UtilValidate.getStringFromInputStream(new ByteArrayInputStream(bytes));
                if (i== WebResponseConstants.ResponseCode.OK){
                    Gson gson = new Gson();
                    notificationHolderObj=new ProductNotification();
                    notificationHolderObj=gson.fromJson(response,ProductNotification.class);
                    if (UtilValidate.isNull(asyncTaskCallBack)){
                        asyncTaskCallBack.onFinish(i,notificationHolderObj);
                    }


                }
                if (i==WebResponseConstants.ResponseCode.UN_AUTHORIZED){
                    Gson gson=new Gson();
                    notificationHolderObj=new ProductNotification();
                    notificationHolderObj=gson.fromJson(response,ProductNotification.class);
                    if (UtilValidate.isNotNull(asyncTaskCallBack)){
                        asyncTaskCallBack.onFinish(i,notificationHolderObj);
                    }
                }

            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }
        });

    }
}
