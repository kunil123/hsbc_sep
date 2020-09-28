package com.google.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.google.entity.Pojo;

public class GoogleDao implements GoogleDaoInterface {

	@Override
	public int SendData(Pojo p) throws Exception {
		System.out.println(p.getAddress());
		System.out.println(p.getName());
		System.out.println(p.getEmail());
		System.out.println(p.getPassword());
		
		Connection con=null;
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con= DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		PreparedStatement ps = con.prepareStatement("Insert into google values(?,?,?,?)");
		ps.setString(1, p.getName());
		ps.setString(2,p.getEmail());
		ps.setString(3,p.getPassword());
		ps.setString(4,p.getAddress());
		ps.executeUpdate();
		System.out.print("Done");
		return 1;
	}

	@Override
	public int LoginData(Pojo p) throws Exception {
		
		Connection con=null;
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con= DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		PreparedStatement ps = con.prepareStatement("Select * From google Where name=? and password=?");
		ps.setString(1, p.getName());
		ps.setString(2,p.getPassword());
		ResultSet rs = ps.executeQuery();
		System.out.print("Done");
		
		
		int i=0;
		if(rs.next()) {
			 
			i++;
		}
		System.out.print("i="+i);
			return i;
		
		
		
	}
	
	
	@Override
	public ArrayList<Pojo> FriendList(Pojo p) throws Exception {
		
		ArrayList<Pojo> friends = new ArrayList<Pojo>();
		Connection con=null;
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con= DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		PreparedStatement ps = con.prepareStatement("Select * From Friends Where name=?");
		ps.setString(1, p.getName());
		
		ResultSet rs = ps.executeQuery();
		System.out.print("Done");
		int i=0;
		while(rs.next()) {
			Pojo x = new Pojo();
			System.out.println(rs.getString(1));
			x.setName(rs.getString(1));
			friends.add(x);
			i++;
		}
		System.out.println(i);
		return friends;
		
		
		
		
		
		
	}

}
