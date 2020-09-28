package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.entity.Pojo;
import com.google.service.GoogleService;
import com.google.service.GoogleServiceInterface;

public class loginservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n1 = request.getParameter("name");
		String n2 = request.getParameter("password");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
			
		
		
		
		
		Pojo p = new Pojo();
		p.setName(n1);
		p.setPassword(n2);
		
		GoogleServiceInterface gs = new GoogleService();
		try {
			int i=gs.LoginData(p);
			if (i>0) {
				HttpSession ss = request.getSession();
				ss.setAttribute("userid", n1);
				ss.setAttribute("pass", n2);
				out.println(" Hi "+n1+"Login sucessful.<a href=FriendList>Click here to View Friends</a>");
			}
			
			else {
				out.println("Invalid Password and ID");
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginform.html");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		out.println("</html></body>");
	}

}
