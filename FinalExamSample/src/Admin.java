import java.io.File;
import java.util.List;

public class Admin extends User{
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public UserRole getUserRole() {
        return UserRole.ADMIN;
    }

    public void createUser(String username, String password, UserRole role){
        User newUser = null;
        switch(role){
            case STUDENT -> {
                newUser = new Student(username, password);
            }
            case TEACHER -> {
                newUser = new Teacher(username,password);
            }
        }
        List<User> list = FileManager.readFromFile();
        list.add(newUser);
        FileManager.writeOnFile(list);
    }
}
