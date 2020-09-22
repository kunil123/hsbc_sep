package whatsapp_service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import UserDefinedException.UserDefinedException;
import whatsapp_Pojo.Pojo;
import whatsapp_dao.WhatsappDao;
import whatsapp_dao.WhatsappDaoInterface;

public class WhatsappService implements WhatsappServiceInterface{
	
	WhatsappDaoInterface ws;
	
	public WhatsappService() {
		ws=new WhatsappDao();
		
	}

	@Override
	public int CreateProfileService(Pojo p) throws Exception  {
		int i=ws.CreateProfileDao(p);
		return i;
		
	}

	@Override
	public void UpdateProfileService(Pojo p) throws Exception {
		ws.UpdateProfileDao(p);
		
	}

	@Override
	public void DeleteProfileService(Pojo p) throws Exception {
		ws.DeleteProfileDao(p);
		
	}

	@Override
	public void SearchProfileService() {
		ws.SearchProfileDao();
		
	}

	@Override
	public Pojo ViewProfileService(Pojo p) throws UserDefinedException {
		Pojo x=ws.ViewProfileDao(p);
		return x;
	}

	@Override
	public void ViewallProfileService() {
		ws.ViewallProfileDao();
		
	}

	@Override
	public void UpdateProfileService2(Pojo p) throws Exception {
		ws.UpdateProfileDao2(p);
		
	}

}
