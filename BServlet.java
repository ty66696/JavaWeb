package com.bjpowernode.javaweb.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class BServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException{

		// ��request����ȡ���󶨵����ݡ�
		Object obj = request.getAttribute("sysTime");

		// ����������
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("request���л�ȡ��ϵͳ��ǰʱ�� = " + obj);
	}
}