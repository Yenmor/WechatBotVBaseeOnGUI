package cn.yenmor.chatRobot;

public class RememberDate {
	private int day = 0;
	public void concertDay() {
		for(;true;) {
		day ++;
		try {
			Thread.sleep(86400000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	public void writeDay() {
		
	}
	public int getDay() {
		return this.day;
	}

}
