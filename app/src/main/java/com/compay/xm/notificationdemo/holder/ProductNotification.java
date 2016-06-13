package com.compay.xm.notificationdemo.holder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by vivek on 10/6/16.
 */
public class ProductNotification implements Serializable {


    private String status;

    public List<Data> getDataObject() {
        return dataObject;
    }

    public void setDataObject(List<Data> dataObject) {
        this.dataObject = dataObject;
    }

    private List<Data> dataObject;



    private String code;

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }




    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }


}
