package com.callbacktest;

public class Server {
	
	CallbackTestInterface callbacklistener;

	public void execute(int param) {
		if (null != callbacklistener) {
			callbacklistener.callback(param + 100 + "");
		}
	}

	public void setCallbacklistener(CallbackTestInterface callbacklistener) {
		this.callbacklistener = callbacklistener;
	}
}
