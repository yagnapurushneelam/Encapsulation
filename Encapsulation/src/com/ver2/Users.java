package com.ver2;

public class Users {
	private String msg;

	public String sendMsg() {
		if (msg == null) {
			System.out.println("Msg should not be null");
		}
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
