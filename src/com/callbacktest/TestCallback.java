package com.callbacktest;

public class TestCallback {
	public static void main(String[] args) {
		Server mServer = new Server();
		Client mClient = new Client(mServer);
		mClient.getDate(2);
	}
}
