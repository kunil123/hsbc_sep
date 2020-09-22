package whatsapp_view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import whatsapp_controller.WhatsappController;
import whatsapp_controller.WhatsappControllerInterface;

public class WhatsappView {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cc="y";
		while(cc.equals("y")) {
		
		System.out.println("Enter 1 to Create Profile");
		System.out.println("Enter 2 to Update Profile");
		System.out.println("Enter 3 to Delete Profile");
		System.out.println("Enter 4 to Search Profile");
		System.out.println("Enter 5 to View Profile");
		System.out.println("Enter 6 to Viewall Profile");
		
		int choice = Integer.parseInt(br.readLine());
		WhatsappControllerInterface ws = new WhatsappController();
	
		switch(choice) {
		
		case 1:
			ws.CreateProfileController();
			break;
		case 2:
			ws.UpdateProfileController();
			break;
		case 3:
			ws.DeleteProfileController();
			break;
		case 4:
			ws.SearchProfileController();
			break;
		case 5:
			ws.ViewProfileController();
			break;
		case 6:
			ws.ViewallProfileController();
			break;
		
		}
		
		System.out.print("Do you want to continue");
		cc=br.readLine();
	}
	}

}
