package src.HomeWork;

public class SaveUser implements ISave{
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
