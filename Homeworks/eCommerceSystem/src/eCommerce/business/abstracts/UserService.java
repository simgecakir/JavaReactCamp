package eCommerce.business.abstracts;


import java.util.List;
import eCommerce.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String email, String password);
	void loginWithService(User user);
	void logOut(User user);
	void delete(User user);
	void update(User user);
	
	List<User> getAll();
	
}
