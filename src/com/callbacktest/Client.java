package com.callbacktest;

public class Client {

	private Server mServer;

	public Client(Server mServer) {
		super();
		this.mServer = mServer;
	}

	public void getDate(int param) {
		mServer.setCallbacklistener(new CallbackTestInterface() {

			@Override
			public void callback(String result) {
				System.out.println("callbacklistener------->" + result);
			}
		});
		mServer.execute(param);
	}

}
