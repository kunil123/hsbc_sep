package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.entity.Pojo;
import com.google.service.GoogleService;
import com.google.service.GoogleServiceInterface;


public class FriendList extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ss = request.getSession();
		String name=ss.getAttribute("userid").toString();
		System.out.println(name);
		Pojo x = new Pojo();
		x.setName(name);
		ArrayList<Pojo> l = new ArrayList<Pojo>();
		GoogleServiceInterface gs = new GoogleService();
		try {
			 l=gs.FriendList(x);
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			
			if(l.size()>0) {
				for(Pojo ff:l) {
					out.println(ff.getName());
					out.println("<br>");
				}
			}
			else {
				out.println("no friend found");
			}
			
			out.println("</body></html>");
		}
		
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
}
