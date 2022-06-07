package odevKodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Kadircan Avcı", "123456", "ka@gmail.com", "universty");
		
		Instructor instructor1 = new Instructor(2, "Engin Demirog", "78910", "ed@gmail.com", "High");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor1);
	}

}
