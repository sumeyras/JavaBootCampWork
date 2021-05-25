package day4Work3.Business.Concretes;

import java.text.DecimalFormat;

import day4Work3.Business.Abstracts.ISaleManagerService;
import day4Work3.Entities.Concretes.Campaign;
import day4Work3.Entities.Concretes.Customer;
import day4Work3.Entities.Concretes.Game;

public class SaleManager implements ISaleManagerService{

	@Override
	public void SaleGame(Customer customer, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		
		double previousPrice = game.getPrice();
		
		if (game.getCampaign()==null) {
			System.out.println(customer.getFirstname()+" taraf�ndan al�nan "+game.getName()+" adl� oyunda kampanya uygulanmam��t�r.");
			System.out.println("�r�n�n sat�� fiyat�: " + game.getPrice() +" TL'dir." );
		}
		else {
			
			double discountPrice = previousPrice*(1-((double)game.getCampaign().getDiscount()/100));
			System.out.println(customer.getFirstname()+" taraf�ndan al�nan "+game.getName()+" adl� oyunda %"+game.getCampaign().getDiscount()+" kampanya uygulanm��t�r.");
			System.out.println("Fiyat : " + previousPrice + " TL");
			System.out.printf("Kampanya Sonras� Fiyat : " + new DecimalFormat("##.##").format(discountPrice).replace(',', '.') + " TL");
		}
		
	}


}
