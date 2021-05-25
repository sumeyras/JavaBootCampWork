package day2Work1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		course1.setExplanation("2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.");
		course1.setFree(true);
		course1.setInstructorName("Engin Demiro�");
		
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.",
				true, "Engin Demiro�");
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Programlamaya Giri� i�in Temel Kurs");
		course3.setExplanation("PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");
		course3.setFree(true);
		course3.setInstructorName("Engin Demiro�");

		
		Course[] courses  = {course1, course2, course3};
		
		for (Course course : courses) {
			
			System.out.println(""+course.getName());
			
		}
		
		System.out.println("\n******** T�M KURSLAR ********\n");
		CourseManager courseManager = new CourseManager();
		courseManager.listCourses(courses);
		
		System.out.println("\n******************************\n");
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);

	}

}
