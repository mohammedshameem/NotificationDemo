package com.compay.xm.notificationdemo.holder;

import java.io.Serializable;

/**
 * Created by vivek on 10/6/16.
 */
public class ProductNotification implements Serializable {


    private String status;

    private Data[] data;

    private String code;

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [status = "+status+", data = "+data+", code = "+code+"]";
    }
}
