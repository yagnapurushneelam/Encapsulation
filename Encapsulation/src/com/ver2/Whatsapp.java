package com.ver2;

public class Whatsapp {
	public static void main(String[] args) {
		Users Yagnesh = new Users();
		Users Yagnapurush = new Users();
		Users Yaggu = new Users();
		
		Yagnesh.setMsg("hi hello");
		System.out.println(Yagnesh.sendMsg());
		
		Yagnapurush.setMsg("Hello world");
		System.out.println(Yagnapurush.sendMsg());

		Yaggu.setMsg(null);
		Yaggu.sendMsg();
	}

}
