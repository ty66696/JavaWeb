package org.apache;

import java.util.Scanner;
import java.util.Properties;
import java.io.FileReader;
import javax.servlet.Servlet;

// �䵱Tomcat�������Ŀ�����
public class Tomcat{
	public static void main(String[] args) throws Exception{
		System.out.println("Tomcat�����������ɹ�����ʼ�����û��ķ��ʡ�");

		// �򵥵�ʹ��Scanner��ģ��һ���û�������
		// �û����ʷ�������ͨ��������ϵġ�����·����
		// Ҳ����˵�û�����·����ͬ����ִ̨�е�Servlet��ͬ��
		/*
			/userList    UserListServlet
			/login		 UserLoginServlet
			/bank		 BankServlet
			......
		*/
		System.out.print("���������ķ���·����");
		Scanner s = new Scanner(System.in);

		// �û�������·��  /bbbb
		String key = s.nextLine(); // Tomcat�������Ѿ���ȡ�����û�������·���ˡ�

		// Tomcat������Ӧ��ͨ���û�������·���Ҷ�Ӧ��XXXServlet
		// ����·����XXXServlet֮��Ĺ�ϵӦ����˭ָ���أ�
		// ����Tomcat��������˵��Ҫ���������ļ�
		FileReader reader = new FileReader("web.properties");
		Properties pro = new Properties();
		pro.load(reader);
		reader.close();

		// ͨ��key��ȡvalue
		String className = pro.getProperty(key);
		// ͨ��������ƴ�������
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance(); // obj�����Ͷ���Tomcat������������Ա��˵��֪����
		
		// ����Tomcat�������Ŀ�����֪������д��XXXXServletһ��ʵ����Servlet�ӿ�
		Servlet servlet = (Servlet)obj;
		servlet.service();

	}
}