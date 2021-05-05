package Entities;

import java.time.LocalDateTime;

public class Order {
	
	private int id;
	private LocalDateTime orderTime;
	
	private Game game;
	private Campaign campaign;
	private double totalPrice;
	
	public Order(int id,Game game,Campaign campaign) {
		this.id = id;
		this.game = game;
		this.campaign = campaign;
	
		orderTime = LocalDateTime.now();
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public double getTotalPrice() {
		
		this.totalPrice = game.getPrice() - (game.getPrice() * (campaign.getDiscount() / 100));
		return  totalPrice;
	}
	
	
	
	
}

