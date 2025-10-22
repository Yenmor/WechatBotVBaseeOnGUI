package cn.yenmor.chatRobot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import com.sun.glass.events.KeyEvent;

public class MaidRobot extends java.awt.Robot{

	public MaidRobot() throws AWTException {
		super();
		// TODO Auto-generated constructor stub
	}
	TimeGet timeGet = new TimeGet();
	Fileloader fileLoader = new Fileloader();
	
	 
	public void  contrast() throws InterruptedException {
		for(;true;) {
			
			Thread.sleep(500);
			
			switch(timeGet.getContrastDate()){
		     case 740:
		         firstClass();
		         break;
		     case 855:
		         secondClass();
		         break;
		     case 955:
		         thirdClass();
		         break;
		     case 1055:
			     forthClass();
			     break;
		     case 1141:
			     fifthClass();
			     break;
		     case 1300:
			     sixthClass();
			     break;
		     case 1505:
			     seventhClass();
			     break;
		     case 1605:
			     eighthClass();
			     break;
		     case 1700:
			     ninthClass();
			     break;
		     case 700:
			     goodMorning();
			     break;
		     case 1200:
			     goodNoon();
			     break;
		     case 2000:
			     goodAfterNoon();
			     break;
		     case 2330:
			     goodMidnight();
			     break;
		     default:
		       break;		       		
		   }
		}		
	}
	public void moveAndClip(String s,String b) {		
		new RobotClipboard(s,b);
		System.out.println(TimeGet.getShowDate());
		delay(200);
		mouseMove(Static.WECHAT_X, Static.WECHAT_Y);
		mousePress(InputEvent.BUTTON1_MASK);
		delay(200);
		mouseRelease(InputEvent.BUTTON1_MASK);
		keyPress(KeyEvent.VK_CONTROL);
		keyPress(KeyEvent.VK_V);
		delay(200);
		keyRelease(KeyEvent.VK_CONTROL);
		keyRelease(KeyEvent.VK_V); 
		delay(200);
		keyPress(KeyEvent.VK_ENTER);
		delay(200);
		keyRelease(KeyEvent.VK_ENTER);
		delay(60000);
		delay(60000);
		delay(60000);
	}
	public void moveAndClip(String s) {		
		new RobotClipboard(s);
		mouseMove(Static.WECHAT_X, Static.WECHAT_Y);
		mousePress(InputEvent.BUTTON1_MASK);
		delay(200);
		mouseRelease(InputEvent.BUTTON1_MASK);
		keyPress(KeyEvent.VK_CONTROL);
		keyPress(KeyEvent.VK_V);
		delay(200);
		keyRelease(KeyEvent.VK_CONTROL);
		keyRelease(KeyEvent.VK_V); 
		delay(200);
		keyPress(KeyEvent.VK_ENTER);
		delay(200);
		keyRelease(KeyEvent.VK_ENTER);
		delay(600);
	}
	public void firstStart() {
		delay(200);
		String s = Static.FIRST_MEET;	
		moveAndClip(s);
	}
	public void firstClass() {
		String s = fileLoader.arr.get(Static.FIRST_CLASS);	
		moveAndClip(s,TimeGet.getShowDate());
	}
    public void secondClass() {
    	String s = fileLoader.arr.get(Static.SECOND_CLASS);
    	moveAndClip(s,TimeGet.getShowDate());
	}
    public void thirdClass() {
    	String s = fileLoader.arr.get(Static.THIRD_CLASS);
    	moveAndClip(s,TimeGet.getShowDate());
	}
    public void forthClass() {
    	String s = fileLoader.arr.get(Static.FFORTH_CLASS);
    	moveAndClip(s,TimeGet.getShowDate());
	}
    public void fifthClass() {
    	String s = fileLoader.arr.get(Static.FIFTH_CLASS);
    	moveAndClip(s,TimeGet.getShowDate());
	}
    public void sixthClass() {

		String s = fileLoader.arr.get(Static.SIXTH_CLASS);	
		moveAndClip(s,TimeGet.getShowDate());
	}
    public void seventhClass() {
    	String s = fileLoader.arr.get(Static.SEVENTH_CLASS);
    	moveAndClip(s,TimeGet.getShowDate());
   	}
    public void eighthClass() {
    	String s = fileLoader.arr.get(Static.EIGHTH_CLASS);
    	moveAndClip(s,TimeGet.getShowDate());
   	}
    public void ninthClass() {
    	String s = fileLoader.arr.get(Static.NINTH_CLASS);
        moveAndClip(s,TimeGet.getShowDate());
   	}
    public void goodMorning() {
    	String s = fileLoader.arr.get(Static.MORNING);
    	moveAndClip(s,TimeGet.getShowDate());
   	}
    public void goodNoon() {
    	String s = fileLoader.arr.get(Static.NOON);
    	moveAndClip(s,TimeGet.getShowDate());
    }
    public void goodAfterNoon() {
    	String s = fileLoader.arr.get(Static.AFTERNOON);
    	moveAndClip(s,TimeGet.getShowDate());
    }
    public void goodMidnight() {
    	String s = fileLoader.arr.get(Static.MIDNIGHT);
    	moveAndClip(s,TimeGet.getShowDate());
    }
}



