package eCommerce.core.concretes;

import eCommerce.GoogleAccount.GoogleAccountManager;
import eCommerce.core.abstracts.LoginService;
import eCommerce.entities.concretes.User;

public class GoogleAccountManagerAdapter implements LoginService {

	@Override
	public void login(User user) {
		
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.login(user);
		
	}
}
