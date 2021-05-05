package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Player player) {

		
		return true;
	}
	

}
