package eCommerce;


import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.EmailVerificationManager;
import eCommerce.core.concretes.GoogleAccountManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager( new HibernateUserDao(), new GoogleAccountManagerAdapter(), new EmailVerificationManager(), new AuthManager());
		
		User user1 = new User(1,"simgeecakir.98@gmail.com","sdfg567","Simge","Çakır");
		User user2 = new User(2,"simge1@icloud.com","sdfvbn","simge","cakir");
		User user3 = new User(2,"simgicloud.com","sdfvbn","simge","cakir");
		
		System.out.println("----------------------------------------");
		userService.register(user1);
		userService.register(user2);
		userService.register(user3);
		System.out.println("----------------------------------------");
		
		userService.login("simge@gmail.com", "sdfg567");
		userService.login("simgeecakir.98@gmail.com", "sdfg567");
		
		userService.loginWithService(user2);
		userService.logOut(user2);
		
		userService.delete(user2);
		
		System.out.println("\n------------------ USERS ----------------------");
		for (User user : userService.getAll()) {
			System.out.println(user.getEmail());
		}

	}

}
