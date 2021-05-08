package eCommerce.business.concretes;

import java.util.regex.*;

import eCommerce.business.abstracts.AuthService;
import eCommerce.core.abstracts.LoginService;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {

	@Override
	public Boolean checkEmail(User user) {
		
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		return matcher.find();
	}

	
	@Override
	public Boolean checkUserName(User user) {
		
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2)
		{
			return true;
		} 
		
		System.out.print("Name and Surname must have at least 2 characters");
		return false;
	}

	
	@Override
	public Boolean checkPassword(User user) {
		
		if(user.getPassword().length() > 5)
		{
			return true;
		}

		System.out.print("Password must have at least 6 characters");
		return false;
	}


	@Override
	public Boolean checkAll(User user) {
		if ( checkEmail(user) && checkPassword(user) && checkUserName(user) )
		{
			return true;
		}
		return false;
	}


}
