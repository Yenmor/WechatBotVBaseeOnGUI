package cn.yenmor.chatRobot;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;


public class RobotClipboard {
	public RobotClipboard(String a) {
	Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();  
    Transferable tText = new StringSelection(a);  
    clip.setContents(tText, null); 	
	}
	
	public RobotClipboard(String a,String b) {
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();  
	    Transferable tText = new StringSelection(b+a);  
	    clip.setContents(tText, null); 	
		}
	
	

}
