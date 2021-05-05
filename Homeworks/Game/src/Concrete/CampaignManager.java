package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDetail() + " detaylı kampanyanız eklendi. ");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getDetail() + " detaylı kampanyanız silindi. ");
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDetail() + " detaylı kampanyanız güncellendi. ");
	}
}
