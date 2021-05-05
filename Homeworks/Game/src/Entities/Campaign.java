package Entities;

public class Campaign {

	private int id;
	private int discount;
	private String detail;
	
	
	public Campaign(int id, int discount, String detail) {
		super();
		this.id = id;
		this.discount = discount;
		this.detail = detail;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	
}
