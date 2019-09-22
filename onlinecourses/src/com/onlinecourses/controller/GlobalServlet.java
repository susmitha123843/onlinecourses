package com.onlinecourses.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlinecourses.service.OnlinecourseService;
import com.onlinecourses.service.OnlinecourseServiceInterface;
import com.onlinecourses.service.OnlinecourseStudent;

public class GlobalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response, Object address) throws ServletException, IOException {
	
		
		String option=request.getParameter("ac");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		if(option.equals("register"))
		{
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String address1=request.getParameter("address");
		//passs the info to srvc lyr thrgh obj by dig trnfrm method
		OnlinecourseStudent os=new OnlinecourseStudent();
		os.setName(name);
		os.setPass(pass);
		os.setEmail(email);
		os.setAddress(address1);
		//pass obj to srvc lyr by fctry method by using interface
		OnlinecourseServiceInterface ocs=OnlinecourseService.createServiceObject();
		int i=ocs.createProfile(os);
		if(i>0)
		{
			out.println("profile created");
		}else
		{
			out.println("profile cant be created");
		}
		}
	if(option.equals("login")){
		
	
	if(option.equals("time line")){
		
	}
	
	}
	}
}
