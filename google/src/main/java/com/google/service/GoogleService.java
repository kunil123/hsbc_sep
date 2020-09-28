package com.google.service;

import java.util.ArrayList;

import com.google.dao.GoogleDao;
import com.google.dao.GoogleDaoInterface;
import com.google.entity.Pojo;

public class GoogleService implements GoogleServiceInterface{

	@Override
	public int SendData(Pojo p) throws Exception {
		
		GoogleDaoInterface gd = new GoogleDao();
		int i=gd.SendData(p);
		return i;
	}
	
public int LoginData(Pojo p) throws Exception {
		
		GoogleDaoInterface gd = new GoogleDao();
		int i=gd.LoginData(p);
		return i;
	}

@Override
public ArrayList<Pojo> FriendList(Pojo p) throws Exception {
	GoogleDaoInterface gd = new GoogleDao();
	ArrayList<Pojo> a = new ArrayList<Pojo>();
	a=gd.FriendList(p);
	return a;
	
}

	
}
