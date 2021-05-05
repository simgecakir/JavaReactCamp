package Concrete;

import Abstract.OrderService;
import Entities.Order;
import Entities.Player;

public class OrderManager implements OrderService {

	@Override
	public void getOrder(Player player, Order order) {
		
		if (player.isValid()) {
		System.out.println("Siparişiniz alınmıştır.\n" +
		"____DETAYLAR____\n" +
				
		"Alıcı : " + player.getFirstName() + " " + player.getLastName() +
		"\nKampanya : " + order.getCampaign().getDetail() +
		"\nToplam : " + order.getTotalPrice());
		
		}
		else{
			System.out.println("Kullanıcı bulunamadığı için siparişiniz alınamadı.");
		}
		
	}
	
	@Override
	public void cancelOrder(Player player,Order order) {
		System.out.println("Sayın " + player.getFirstName() + " " + player.getLastName() + 
				order.getId() + "  numaralı sipaişiniz iptal edilmiştir.");
	}
	
}
