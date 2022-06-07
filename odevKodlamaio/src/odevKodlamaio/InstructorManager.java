package odevKodlamaio;

public class InstructorManager extends UserManager {
	 @Override
	public void add(User user) {
		System.out.println("Yeni öğretmen "+user.getFullName() + " eklendi");
	}
}
