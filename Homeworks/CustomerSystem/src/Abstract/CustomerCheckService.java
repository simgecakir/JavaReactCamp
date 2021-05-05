package Abstract;

import Entities.Customer;

public abstract interface CustomerCheckService {

	public Boolean CheckIfRealPerson(Customer customer);
	
}
