package day3Work2;

public class StudentManager extends UserManager {
	
	@Override
	public void register(User user) {
		System.out.println("" + user.getEmail() +" ��renci olarak sisteme eklendi");
	}
	

}
