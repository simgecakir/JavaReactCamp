package eCommerce.core.abstracts;

import eCommerce.entities.concretes.User;

public interface VerificationService {

	void send(User user);
	Boolean confirm();
}
