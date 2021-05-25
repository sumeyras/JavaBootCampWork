package day5ECommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5ECommerceDemo.core.abstracts.UserValidateService;
import day5ECommerceDemo.entities.concretes.User;


public class UserValidateManager implements UserValidateService{

	
	private String regex = "^(.+)@(.+)$";
	
	public boolean eMailValidate(String email) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	
	@Override
	public boolean validate(User user) {
			
		if(user.getFirstName()!= null && user.getLastName()!= null && user.geteMail()!= null && user.getPassword()!= null ) {
					
			if(user.getFirstName().length()<2 || user.getLastName().length()<2 ) {
				System.out.println("Ad Soyad en az 2 karakterden olu�mal�d�r. ");
				return false;
				
			}
			
			if(!eMailValidate(user.geteMail())){
				
				System.out.println("Girdi�iniz e-mail adresi e-mail format�na uygun de�ildir.");
				return false;
			}
			if(user.getPassword().length() < 6) {
				System.out.println("Parola 6 karakterden k���k olamaz");
				return false;
			}
			
		}else {
				
			if(user.getFirstName()== null) {
				System.out.println("�sim k�sm� bo� b�rak�lamaz");
				return false;
			}

			if(user.getLastName()== null) {
				System.out.println("Soyisim k�sm� bo� b�rak�lamaz");
				return false;
			}

			if(user.geteMail()== null) {
				System.out.println("E-mail k�sm� bo� b�rak�lamaz");
				return false;
			}

			if(user.getPassword()== null) {
				System.out.println("Parola k�sm� bo� b�rak�lamaz");
				return false;
			}
		}
		
		return true;
		
	}


	@Override
	public boolean signInControl(String email, String password) {
		if(email != null && password != null )
		{
			return true;
		}else {
			System.out.println("E mail ve �ifre bo� b�rak�lamaz");
			return false;
		}
		
	}
}
