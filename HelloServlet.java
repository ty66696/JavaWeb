package com.bjpowernode.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet implements Servlet{

	// 5������
	public void init(ServletConfig config) throws ServletException{
	
	}

	public void service(ServletRequest request,ServletResponse response)
		throws ServletException , IOException{

		// �����̨��ӡ���
		System.out.println("My First Servlet, Hello Servlet");

		// ������Ӧ��������������ͨ�ı���html����
		// ��Ҫ�ڻ�ȡ������֮ǰ���ã���Ч��
		response.setContentType("text/html");

		// ��ô��һ����Ϣֱ�������������ϣ�
		// ��Ҫʹ��ServletResponse�ӿڣ�response
		// response��ʾ��Ӧ���ӷ�������������������ݽ�����Ӧ��
		PrintWriter out = response.getWriter();
		
		// ������Ӧ����������ʱ��Ҫ�ڻ�ȡ��֮�����á�
		//response.setContentType("text/html");

		out.print("Hello Servlet, You are my first servlet!");

		// ��������ܹ�ʶ��html����ģ��������ǲ���Ӧ�����һ��HTML�����أ�
		out.print("<h1>hello servlet�����Servlet</h1>");

		// ����һ�����������������ַ����������
		// ������������Ҫ����ˢ�£�Ҳ����Ҫ���ǹرգ���Щ����Tomcat��ά����
		/*
		out.flush();
		out.close();
		*/
	}

	public void destroy(){
	
	}

	public String getServletInfo(){
		return "";
	}

	public ServletConfig getServletConfig(){
		return null;
	}
}