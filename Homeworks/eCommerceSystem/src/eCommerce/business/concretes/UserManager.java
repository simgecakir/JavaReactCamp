package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.LoginService;
import eCommerce.core.abstracts.VerificationService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;
	private LoginService loginService;
	private VerificationService verificationService;
	

	public UserManager(UserDao userDao, LoginService loginService, VerificationService verificationService, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.loginService = loginService;
		this.verificationService = verificationService;
	}
	
	public UserManager(UserDao userDao, VerificationService verificationService, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.verificationService = verificationService;
	}


	@Override
	public void register(User user) {
		
		if ( authService.checkAll(user) )
		{
			verificationService.send(user);
			
			if ( verificationService.confirm() )
			{
				userDao.add(user);
				System.out.println("You successfully registered : " + user.getEmail() + "\n");
			}
			else 
			{
				System.out.println("You could not register, please confirm your email address.");
			}
		}else {
			System.out.println("You could not register");
		}
	}


	@Override
	public void login(String email, String password) {
		
		
			for (User user : UserDao.users) {
				
				if (user.getEmail() == email && user.getPassword() == password) {
					System.out.println(user.getFirstName() + " successfully login");
					return;
				}
			}
			System.out.println("User could not found.");
		}
	
	
	@Override
	public void loginWithService(User user) {
		
		loginService.login(user);
	}


	@Override
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " log out");
		
	}
	
	@Override
	public void delete(User user) {
		
		for (User _user : UserDao.users) {
			
			if (user == _user ) {
				
				userDao.delete(user);
				System.out.println(user.getFirstName() + " successfully deleted");
				return;
			}
		}
		System.out.println("User could not found.");
	}

	@Override
	public void update(User user) {
		System.out.println("User id: " + user.getId() + " updated.");
		
	}


	@Override
	public List<User> getAll() {
		return UserDao.users;
	}
}
