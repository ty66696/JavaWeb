package com.bjpowernode.javaweb.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class AServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException{

		// ��ȡϵͳ��ǰʱ��
		Date nowTime = new Date();

		// ��request���а����ݡ�
		request.setAttribute("sysTime", nowTime);

		// ��request����ȡ���󶨵����ݡ�
		//Object obj = request.getAttribute("sysTime");

		// ����������
		/*
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("request���л�ȡ��ϵͳ��ǰʱ�� = " + obj);
		*/

		// ͨ��AServlet�ܲ�����ת��BServlet
		// ��AServlet��BServlet�ŵ�һ�������С�
		// ���Եġ�ʹ��Servlet��������ת�����ơ����½ڿ���˵����
	}
}