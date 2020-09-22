package whatsapp_service;

import UserDefinedException.UserDefinedException;
import whatsapp_Pojo.Pojo;

public interface WhatsappServiceInterface {

	int CreateProfileService(Pojo p) throws Exception ;

	void UpdateProfileService(Pojo p)  throws Exception;
	
	void UpdateProfileService2(Pojo p)  throws Exception;
	
	void DeleteProfileService(Pojo p3) throws Exception;

	void SearchProfileService();

	Pojo ViewProfileService(Pojo p) throws UserDefinedException;

	void ViewallProfileService();

}
