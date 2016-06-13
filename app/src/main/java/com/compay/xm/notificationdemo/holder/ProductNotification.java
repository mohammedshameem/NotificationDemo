package com.compay.xm.notificationdemo.holder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by vivek on 10/6/16.
 */
public class ProductNotification implements Serializable {


    private String status;
    private List<Data> data;
    private int code;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
