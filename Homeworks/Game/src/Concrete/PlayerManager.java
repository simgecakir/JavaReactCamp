package Concrete;
import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void register(Player player) {
		
		 if (playerCheckService.CheckIfRealPerson(player))
		 {
			 player.setValid(true);
			 System.out.println(player.getFirstName() + " has been registered");
		 }
		 else 
		 {
			 player.setValid(false);
			 System.out.println("Person is not valid");
		 }
		
	}
	
	@Override
	public void delete(Player player) {
		
		System.out.print(player.getFirstName() + " silindi. ");
      }
	
	@Override
	public void update(Player player) {
		
		System.out.print(player.getFirstName() + " güncellendi.");
	}

}
