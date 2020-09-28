package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.entity.Pojo;
import com.google.service.GoogleService;
import com.google.service.GoogleServiceInterface;


public class RegistrationServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n1 = request.getParameter("name");
		String n2 = request.getParameter("email");
		String n3 = request.getParameter("password");
		String n4 = request.getParameter("address");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
			out.println("<br>Your name is"+n1);
			out.println("<br>Your email is"+n2);
			out.println("<br>Your password is"+n3);
			out.println("<br>Your address is"+n4);
			
			
			
			Pojo p = new Pojo();
			p.setName(n1);
			p.setEmail(n2);
			p.setPassword(n3);
			p.setAddress(n4);
			
			GoogleServiceInterface gs = new GoogleService();
			try {
				int i=gs.SendData(p);
				if (i==1) {
					out.println("Registration sucessful.<a href=loginform.html>Click here to login</a>");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			out.println("</html></body>");
		}

}
