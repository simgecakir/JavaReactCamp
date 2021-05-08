package eCommerce.dataAccess.abstracts;

import java.util.ArrayList;
import eCommerce.entities.concretes.User;

public interface UserDao {

	ArrayList<User> users = new ArrayList<User>();
	
	void add(User user);
	void update(User user);
	void delete(User user);
	
}
