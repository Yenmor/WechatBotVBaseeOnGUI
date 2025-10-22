package cn.yenmor.chatRobot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeGet {
	public TimeGet(){
	}	
	private SimpleDateFormat contrastMod = new SimpleDateFormat("HHmm");
	
	private  static SimpleDateFormat showMod = new SimpleDateFormat("现在是YYYY年的第DDD天HH时mm分！"+"\r\n");

		
  public int getContrastDate() {
	String str = this.contrastMod.format(new Date());
	int a = Integer.valueOf(str);	
	return a;
  }
	
  public static String getShowDate() {
	String str =Static.NAME+"提醒您   现在是"+ showMod.format(new Date());
	return str;
	
     }
}
