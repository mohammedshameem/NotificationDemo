package com.compay.xm.notificationdemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.compay.xm.notificationdemo.R;
import com.compay.xm.notificationdemo.Utilvalidate.UtilValidate;
import com.compay.xm.notificationdemo.holder.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivek on 10/6/16.
 */
public class NotificationAdapter extends BaseAdapter{

    List<Data> NotificationList = new ArrayList<Data>();
    LayoutInflater inflater;
    Context context;
    StringBuilder message;


    public NotificationAdapter(Context context, List<Data> NotificationList) {
        this.NotificationList = NotificationList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return NotificationList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mViewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.layout_list_item, parent, false);
            mViewHolder = new MyViewHolder(convertView);



            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }
        message = new StringBuilder();
        if (UtilValidate.isNotNull(NotificationList)){
            if (UtilValidate.isNotNull(NotificationList.get(position).getNotification_type())){
                if (NotificationList.get(position).getNotification_type().equals("1")){
                    mViewHolder.item_image.setVisibility(View.VISIBLE);
                    message.append("You have liked  " + NotificationList.get(position).getProduct().getName());
                    mViewHolder.notificationMessage.setText(message);

                } else if (NotificationList.get(position).getNotification_type().equals("2")) {

                    //viewHolder.tvUserName.setVisibility(View.GONE);
                    mViewHolder.item_image.setVisibility(View.VISIBLE);
                    message.append("You have commented on " + NotificationList.get(position).getProduct().getName());
                    mViewHolder.notificationMessage.setText(message);

                }
                else if (NotificationList.get(position).getNotification_type().equals("3")){
                    //Here type it...
                    //viewHolder.tvUserName.setVisibility(View.GONE);
                    mViewHolder.item_image.setVisibility(View.VISIBLE);
                    message.append("You have purchased " + NotificationList.get(position).getProduct().getName());
                    mViewHolder.notificationMessage.setText(message);
                }
            }
        }


        /*mViewHolder.tvTitle.setText(flowerList.get(position).getName());
        mViewHolder.tvDesc.setText(flowerList.get(position).getInstructions());
        String imageURL = flowerListData.getPhoto();
        Picasso.with(context).load(imageURL).into(mViewHolder.ivIcon); //Always viewholderConstructor.anyView*/
        return convertView;
    }

    private class MyViewHolder {
        private ImageView item_image;
        private ImageView profile_image;
        private LinearLayout descriptionMainLayout;
        private TextView notificationMessage;

        private TextView tvUserName;

        private TextView item_hours;

        public MyViewHolder(View item) {
           /* tvTitle = (TextView) item.findViewById(R.id.tvTitle);
            tvDesc = (TextView) item.findViewById(R.id.tvDesc);
            ivIcon = (ImageView) item.findViewById(R.id.ivIcon);*/

            profile_image = (ImageView)item.findViewById(R.id.notification_profile_image);
            item_image = (ImageView) item.findViewById(R.id.notification_product_image);
            item_hours = (TextView) item.findViewById(R.id.notification_time);
            notificationMessage = (TextView)item.findViewById(R.id.notification_message);
            descriptionMainLayout = (LinearLayout)item.findViewById(R.id.description_main_layout);
        }
    }
}