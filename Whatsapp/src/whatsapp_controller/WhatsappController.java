package whatsapp_controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import UserDefinedException.UserDefinedException;
import whatsapp_Pojo.Pojo;
import whatsapp_service.WhatsappService;
import whatsapp_service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface{
	
	WhatsappServiceInterface ws;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public WhatsappController() {
		 ws = new WhatsappService();
	}

	@Override
	public void CreateProfileController() throws Exception {
		
		System.out.println("Enter your email id");
		String email = br.readLine();
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your password");
		String password = br.readLine();
		
		Pojo p = new Pojo();
		p.setEmail(email);
		p.setName(name);
		p.setPassword(password);
		
		int i=ws.CreateProfileService(p);
		if(i==1) {
			System.out.println("Profile Created");
		}
	}

	@Override
	public void UpdateProfileController() throws Exception {
		System.out.println("Enter the email of the profile to update");
		String email=br.readLine();
		
		System.out.println("Enter 1 to update username");
		System.out.println("Enter 2 to update password");
		int choice = Integer.parseInt(br.readLine());
		if (choice ==1) {
		System.out.println("Enter the new username");
		String un=br.readLine();
		Pojo p3 = new Pojo();
		p3.setEmail(email);
		p3.setName(un);
		ws.UpdateProfileService(p3);
		}
		
		else
		{
			
			System.out.println("Enter the new Password");
			String un=br.readLine();
			Pojo p3 = new Pojo();
			p3.setEmail(email);
			p3.setPassword(un);
			ws.UpdateProfileService2(p3);
		}
		
	}

	@Override
	public void DeleteProfileController() throws Exception {
		System.out.println("Enter the email of the profile to update");
		String email=br.readLine();
		System.out.println("Enter the new username");
		String un=br.readLine();
		Pojo p3 = new Pojo();
		p3.setEmail(email);
		p3.setName(un);
		ws.DeleteProfileService(p3);
		
	}

	@Override
	public void SearchProfileController() {
		ws.SearchProfileService();
		
	}

	@Override
	public void ViewProfileController() throws UserDefinedException {
		try {
		System.out.println("Enter email to view profile");
		String mail=br.readLine();
		Pojo p= new Pojo();
		p.setEmail(mail);
		Pojo x =ws.ViewProfileService(p);
		
		System.out.println("Your current Email:"+x.getEmail());
		System.out.println("Your current Name:"+x.getName());
		System.out.println("Your current Password:"+x.getPassword());
		}catch(IOException|UserDefinedException e){
			System.out.println("User not found \n"+e);
		}
		
		
	}

	@Override
	public void ViewallProfileController() {
		ws.ViewallProfileService();
		
	}

}
