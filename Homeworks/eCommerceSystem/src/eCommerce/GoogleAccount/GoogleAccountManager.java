package eCommerce.GoogleAccount;

import eCommerce.entities.concretes.User;

public class GoogleAccountManager {

	public void login(User user)
	{
		System.out.println(user.getFirstName() + " successfully login with google account");
	}
}
