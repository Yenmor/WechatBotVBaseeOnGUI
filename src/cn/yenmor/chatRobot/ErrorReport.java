package cn.yenmor.chatRobot;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrorReport {
	
	public void cannotFind() {
    	 
    	  JFrame f = new JFrame();
    	  JLabel l = new JLabel("�Ҳ����ļ�,����C://yenmor/Ŀ¼�½���һ��RobotText.txt");
    	  JLabel l2 = new JLabel("ÿ��һ��һ������");
    	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  l.setFont(new Font("����",Font.BOLD,60));
    	  l.setForeground(Color.red);
    	  l2.setFont(new Font("����",Font.BOLD,60));
    	  l2.setForeground(Color.red);
    	  f.setLayout(new FlowLayout());
    	  f.setSize(1800,200);    	  
    	  f.add(l);  
    	  f.add(l2);
    	  f.setVisible(true);   
     }
	public  void fileLoadFiled() {
   	 
  	  JFrame f = new JFrame();
  	  JLabel l = new JLabel("��ȡ�ļ�ʧ��,��ȷ�������Ƿ���ȷ");
  	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	 l.setFont(new Font("����",Font.BOLD,60));
  	 l.setForeground(Color.red);

  	 f.setSize(1800, 200);	  
  	 f.add(l);
  	 f.setVisible(true);
  	     	    	    	 
  	   
   }
}
