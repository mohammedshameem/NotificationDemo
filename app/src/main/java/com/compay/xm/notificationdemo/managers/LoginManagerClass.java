package com.compay.xm.notificationdemo.managers;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.compay.xm.notificationdemo.Utilvalidate.UtilValidate;
import com.compay.xm.notificationdemo.constants.ApiConstants;
import com.compay.xm.notificationdemo.constants.User;
import com.compay.xm.notificationdemo.holder.UserObjectHolder;
import com.compay.xm.notificationdemo.webservice.AsyncTaskCallBack;
import com.compay.xm.notificationdemo.webservice.UMEPALAppRestClient;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import java.io.ByteArrayInputStream;

/**
 * Created by vivek on 15/6/16.
 */
public class LoginManagerClass implements ApiConstants, User {
    private static final String TAG = LoginManagerClass.class.getSimpleName();
    private static LoginManagerClass loginManagerClass;
    private UserObjectHolder userObjectHolder;

    public static LoginManagerClass getInstance() {
        if (loginManagerClass == null) {
            loginManagerClass = new LoginManagerClass();
        }
        return loginManagerClass;
    }

    public void emailLogin(final Activity activity, String email_address,
                           String password, final AsyncTaskCallBack signUpCallBack, final int requestcode) {
        // TODO Auto-generated method stub

        RequestParams params = new RequestParams();
        params.put(EmailLoginRequestParams.EMAIL, email_address);
        params.put(EmailLoginRequestParams.PASSWORD, password);


        UMEPALAppRestClient.post(EmailLoginRequestParams.EMAILLOGIN_URL, params, activity,
                new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] bytes) {

                        userObjectHolder = new UserObjectHolder();
                        Gson gson = new Gson();

                        String responseBody = UtilValidate.getStringFromInputStream(new ByteArrayInputStream(bytes));
                        Log.e(TAG, "LOGIN RESPONSE" + responseBody);
                        userObjectHolder = gson.fromJson(responseBody, UserObjectHolder.class);
                        if (UtilValidate.isNotNull(signUpCallBack)) {
                            signUpCallBack.onFinish(requestcode,
                                    userObjectHolder);
                        }

                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                        if (UtilValidate.isNetworkAvailable(activity)) {
                            if (bytes != null) {
                                String responseBody = UtilValidate
                                        .getStringFromInputStream(new ByteArrayInputStream(
                                                bytes));

                                Log.i(TAG, "asyncTaskCallBack on failure" + responseBody);
                                if (signUpCallBack == null) {
                                    Log.i(TAG, "asyncTaskCallBack is null : ");
                                } else {
                                    signUpCallBack.onFinish(0, responseBody);
                                }
                            }
                        } else {
                            Toast.makeText(activity, "No active network!!", Toast.LENGTH_LONG).show();
                            signUpCallBack.onFinish(0, "FAIL");
                        }

                    }
                });

    }
}

