package cn.yenmor.chatRobot;
 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fileloader {
    /**
     * ���ܣ�Java��ȡtxt�ļ�������
     * ���裺1���Ȼ���ļ����
     * 2������ļ��������������һ���ֽ���������Ҫ��������������ж�ȡ
     * 3����ȡ������������Ҫ��ȡ�����ֽ���
     * 4��һ��һ�е������readline()��
     * ��ע����Ҫ���ǵ����쳣���
     * //@param filePath
     */
	   public  Fileloader(){
	        String filePath = "C://yenmor/RobotText.txt";
//	      "res/";
	        readTxtFile(filePath);
	    }
	ArrayList<String> arr = new ArrayList<String>();
	
    public  void readTxtFile(String filePath){
    	 ErrorReport r = new ErrorReport();
    	
        try {
                String encoding="UTF-8";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//���ǵ������ʽ
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    while((lineTxt = bufferedReader.readLine()) != null){      
                        arr.add(lineTxt);
                        int x = 0;                    
                        x = x+1;
                    }
                    read.close();
        }else{
        	r.cannotFind();
            System.out.println("�Ҳ���ָ�����ļ�");
            
        }
        } catch (Exception e) {
        	r.fileLoadFiled();
            System.out.println("��ȡ�ļ����ݳ���");
            e.printStackTrace();
        }
     
    }   
 
}