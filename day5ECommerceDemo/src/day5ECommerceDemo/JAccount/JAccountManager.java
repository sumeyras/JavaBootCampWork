package day5ECommerceDemo.JAccount;

import day5ECommerceDemo.entities.concretes.User;

//D�� Account servisi oldu�unu d���n.
public class JAccountManager {

	public void register(User user) {
		
		System.out.println("Google hesab� ile sisteme kaydolundu : " + user.getFirstName());
	}
}
