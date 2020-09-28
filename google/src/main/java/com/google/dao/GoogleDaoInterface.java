package com.google.dao;

import java.util.ArrayList;

import com.google.entity.Pojo;

public interface GoogleDaoInterface {

	public int SendData(Pojo p) throws Exception;

	public int LoginData(Pojo p) throws Exception;

	public ArrayList<Pojo> FriendList(Pojo p) throws Exception;
}
