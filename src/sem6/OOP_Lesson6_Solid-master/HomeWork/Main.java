import src.HomeWork.*;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");

		IReport report = new Persister();
		report.report(user);

		ISave save = new SaveUser();
		save.save(user);
	}
}