import Abstract.PlayerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.OrderManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		PlayerCheckService playerCheckService = new MernisServiceAdapter();
		
		Game game = new Game(1, 100.0, "game1");
		
		PlayerManager playerManager = new PlayerManager(playerCheckService);
		Player player = new Player(1,"blackshadow","Simge","Çakır","00000000000",1998);
		playerManager.register(player);
		
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, 50, "Hoşgeldin Bahar indirimi");
		campaignManager.add(campaign);

		
		OrderManager orderManager = new OrderManager();
		Order order = new Order(1,game,campaign);
		
		orderManager.getOrder(player, order);
		
		
	}
	
}
