package com.compay.xm.notificationdemo.activity;


import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.compay.xm.notificationdemo.R;
import com.compay.xm.notificationdemo.Utilvalidate.UtilValidate;
import com.compay.xm.notificationdemo.adapters.NotificationAdapter;
import com.compay.xm.notificationdemo.holder.Data;
import com.compay.xm.notificationdemo.holder.ProductNotification;
import com.compay.xm.notificationdemo.managers.NotificationManager;
import com.compay.xm.notificationdemo.webservice.AsyncTaskCallBack;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    NotificationAsynchTaskCallBack notificationAsynchTaskCallBack = new NotificationAsynchTaskCallBack();
    private ListView notificationsList;
    private static final int REQUEST_CODE = 1;
    String session_Id = "vrnjv45736kvaj7j0pe8n98ch2";
    //private ProgressDialog pDialog, deleteDialog;
    LinearLayout notification, noNotification;
    private List<Data> notificationList = new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationsList = (ListView) findViewById(R.id.listview_notification);
        NotificationManager.getInstance().getAllNotifications(MainActivity.this, notificationAsynchTaskCallBack, session_Id);
        notification = (LinearLayout) findViewById(R.id.notification_layout);
        noNotification = (LinearLayout) findViewById(R.id.no_notification_layout);
    }

    public class NotificationAsynchTaskCallBack implements AsyncTaskCallBack {

        @Override
        public void onFinish(int responseCode, Object result) {

            Log.e("In on FInish"," >>> ");

            // TODO Auto-generated method stub
            if (UtilValidate.isNotNull(result)) {

                ProductNotification notificationBaseHolder = (ProductNotification) result;

                Log.e("DATA  >> ", " >> " + notificationBaseHolder.getData().get(1).getUser_firstname());

                if (UtilValidate.isNotNull(notificationBaseHolder.getData())) {

                    notificationList = notificationBaseHolder.getData();

                    Log.e("DATA 1 >> ", " >> " + notificationList.get(1).getUser_firstname());

                    if (notificationList.size() > 0) {

                        notification.setVisibility(View.VISIBLE);
                        noNotification.setVisibility(View.GONE);
                        //clearAll.setVisibility(View.VISIBLE);

                        notificationsList.setAdapter(new NotificationAdapter(MainActivity.this, notificationList));


                          /*  if (UtilValidate.isNotNull(adapter)) {
                                adapter.notifyDataSetChanged();
                            }*/

                    }
                    if (notificationList.size() <= 0) {
                        noNotification.setVisibility(View.VISIBLE);
                        notification.setVisibility(View.GONE);
                        notificationsList.setAdapter(new NotificationAdapter(MainActivity.this, notificationList));
                            /*TodaysParentApp.setNotification_count(notificationList.size());
                            NotificationListAdapter notificationsListAdapter = new NotificationListAdapter(getActivity(), notificationList, Notifica.this);*/
                            /*notificationsList.setAdapter(notificationsListAdapter);
                            notificationsListAdapter.notifyDataSetChanged();*/
                            /*if (UtilValidate.isNotNull(adapter)) {
                                adapter.notifyDataSetChanged();
                            }*/

                    }

                    /**
                     *  updating notification count table....
                     */


                }else {
                    Toast.makeText(MainActivity.this,"error",Toast.LENGTH_LONG).show();
                }


            }

        }

        @Override
        public void onFinish(int responseCode, String result) {

        }
    }
}



/*
 * ALL NOTIFICATION CALLBACK .....
 *//*

public class NotificationAsynchTaskCallBack implements AsyncTaskCallBack {

    @Override
    public void onFinish(int responseCode, Object result) {

        Log.d(TAG, "in onfinish of notification" + responseCode);



    }
*/
