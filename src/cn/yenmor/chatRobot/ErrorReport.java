package cn.yenmor.chatRobot;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrorReport {
	
	public void cannotFind() {
    	 
    	  JFrame f = new JFrame();
    	  JLabel l = new JLabel("找不到文件,请在C://yenmor/目录下建立一个RobotText.txt");
    	  JLabel l2 = new JLabel("每隔一行一个名字");
    	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  l.setFont(new Font("楷体",Font.BOLD,60));
    	  l.setForeground(Color.red);
    	  l2.setFont(new Font("楷体",Font.BOLD,60));
    	  l2.setForeground(Color.red);
    	  f.setLayout(new FlowLayout());
    	  f.setSize(1800,200);    	  
    	  f.add(l);  
    	  f.add(l2);
    	  f.setVisible(true);   
     }
	public  void fileLoadFiled() {
   	 
  	  JFrame f = new JFrame();
  	  JLabel l = new JLabel("读取文件失败,请确定编码是否正确");
  	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	 l.setFont(new Font("楷体",Font.BOLD,60));
  	 l.setForeground(Color.red);

  	 f.setSize(1800, 200);	  
  	 f.add(l);
  	 f.setVisible(true);
  	     	    	    	 
  	   
   }
}
