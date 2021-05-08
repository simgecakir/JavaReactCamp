package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " is added to db by Hibernate. ");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " is updated by Hibernate. ");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " is deleted from db by Hibernate. ");
		
	}


	
}
