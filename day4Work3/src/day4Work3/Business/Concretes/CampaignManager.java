package day4Work3.Business.Concretes;

import day4Work3.Business.Abstracts.ICampaingManagerService;
import day4Work3.Entities.Concretes.Campaign;

public class CampaignManager implements ICampaingManagerService {

	@Override
	public void Add(Campaign campaign) {
		
		System.out.println("Kampanya eklenmi�tir : " + campaign.getName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		
		System.out.println("Kampanya silinmi�tir : " + campaign.getName());
		
	}

	@Override
	public void Update(Campaign campaign) {
		
		System.out.println("Kampanya g�ncellenmi�tir : " + campaign.getName());
		
	}
	
	

}
