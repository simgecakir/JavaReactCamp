package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface AuthService {

	Boolean checkEmail(User user);
	Boolean checkUserName(User user);
	Boolean checkPassword(User user);
	Boolean checkAll(User user);
	
}
