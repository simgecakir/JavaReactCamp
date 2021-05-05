package Abstract;

import Entities.Order;
import Entities.Player;

public interface OrderService {

	void getOrder(Player player,Order order);
	void cancelOrder(Player player,Order order);
}
