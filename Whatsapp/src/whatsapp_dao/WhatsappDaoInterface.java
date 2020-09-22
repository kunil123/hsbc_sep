package whatsapp_dao;

import UserDefinedException.UserDefinedException;
import whatsapp_Pojo.Pojo;

public interface WhatsappDaoInterface {

	int CreateProfileDao(Pojo p) throws Exception;

	void UpdateProfileDao(Pojo p) throws Exception;
	
	void UpdateProfileDao2(Pojo p) throws Exception;

	void DeleteProfileDao(Pojo p) throws Exception;

	void SearchProfileDao();

	Pojo ViewProfileDao(Pojo p) throws UserDefinedException;

	void ViewallProfileDao();

}
