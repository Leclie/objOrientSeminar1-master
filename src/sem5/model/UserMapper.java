package sem5.model;

public class UserMapper {
    public String map(User user, char delimiter) {
        return String.format("%s%c%s%c%s%c%s", user.getId(), delimiter, user.getFirstName(), delimiter, user.getLastName(), delimiter, user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
