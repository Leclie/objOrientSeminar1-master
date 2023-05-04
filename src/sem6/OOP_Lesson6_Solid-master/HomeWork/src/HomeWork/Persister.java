package src.HomeWork;

public class Persister implements IReport{
	@Override
	public void report(User user) {
		System.out.println("Report for user: " + user.getName());
	}
}