package day5ECommerceDemo.dataAccess.concretes;



import java.util.ArrayList;
import java.util.List;

import day5ECommerceDemo.dataAccess.abstracts.UserDao;
import day5ECommerceDemo.entities.concretes.User;

public class XUserDao implements UserDao{
	
	//List Interface oldu�u i�in new lenmez
	public List<String> eMailList = new ArrayList<String>();

	
	@Override
	public boolean search(String email ) {
		
		eMailList.add("shsahsja@hotmail.com");
		
		if (eMailList.contains(email))
		{
			System.out.println("Sistemde bu E mail ' e ait kullan�c� mevcuttur.");
			return false;
		}
		else {

			return true;
		}
			
		
	}


	@Override
	public void addToDb(User user) {
		System.out.println("�yelik ba�ar�yla ger�ekle�tirilmi�tir");
		
	}


	@Override
	public boolean loginControl(String email, String password) {
		User userxdao = new User(1,"S�meyra","�akmak","sumeyra@gmail.com","123456");
		if(!userxdao.geteMail().equals(email) || !userxdao.getPassword().equals(password)) {
			System.out.println("Email veya Parola hatal� girilmi�tir.");
			return false;
		}
		return true;
	}

}
