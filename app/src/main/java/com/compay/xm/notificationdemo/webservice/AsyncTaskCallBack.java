package com.compay.xm.notificationdemo.webservice;

public interface AsyncTaskCallBack {

	public void onFinish(int responseCode, Object result);

	public void onFinish(int responseCode, String result);

	

}
