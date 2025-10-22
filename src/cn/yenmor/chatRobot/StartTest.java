package cn.yenmor.chatRobot;

import java.awt.AWTException;

public class StartTest {
		
	public static void main(String[] args) {
		RememberThread rememberThread = new RememberThread();
		rememberThread.start();
		
		System.out.print(Static.NAME);
		
		MaidRobot maid = null;
		try {
			maid = new MaidRobot();
			try {
				maid.contrast();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		
//		TimeGet t = new TimeGet();
//		System.out.print(t.getContrastDate());

	}

}
//群里的各位好啊!我是群主大人创建的女仆机器人!
//		名为:
//		轻井沢 惠.惠惠.Aalice. ECHO.神裂火织.堕天使工口女仆 !
//		轻井沢 惠.惠惠.Aalice. ECHO.神裂火织.堕天使工口女仆 ������   ������������2025��ĵ�295��20ʱ15�֣�
//
//		今天是我们相遇的第1天!
//		群里所有的人现在都是我的主人啦!想把米浆什么的弄到我身上也完全没问题!
//		更刺激的也可以接受!
//		呐,不来试试吗?
//		我会好好服侍您的(笑)
