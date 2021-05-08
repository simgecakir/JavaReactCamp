package eCommerce.core.concretes;

import eCommerce.core.abstracts.VerificationService;
import eCommerce.entities.concretes.User;

public class EmailVerificationManager implements VerificationService {

	@Override
	public void send(User user) {
		System.out.println("Please verify your " + user.getEmail() + " email address by clicking on the link provided.");
		
	}

	@Override
	public Boolean confirm() {
		return true;
	}
	
	

	
}
