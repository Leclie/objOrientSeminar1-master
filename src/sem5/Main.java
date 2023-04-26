package sem5;


import sem5.controllers.UserController;
import sem5.model.FileOperation;
import sem5.model.FileOperationImpl;
import sem5.model.Repository;
import sem5.model.RepositoryFile;
import sem5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
