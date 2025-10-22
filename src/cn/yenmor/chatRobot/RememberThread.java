package cn.yenmor.chatRobot;

import java.awt.AWTException;

public class RememberThread extends Thread {
	
	public void run(){
		try {
			MaidRobot firstStart = new MaidRobot();
			firstStart.firstStart();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
