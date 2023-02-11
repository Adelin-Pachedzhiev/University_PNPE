import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

public class Teacher extends User{
    public Teacher(String username, String password) {
        super(username, password);
    }

    @Override
    public UserRole getUserRole() {
        return UserRole.TEACHER;
    }

    public static boolean isValidUsername(String username){
        Pattern usernamePat = Pattern.compile("[a-z]+@tu-sofia.bg");
        return usernamePat.matcher(username).matches();
    }

    public static boolean isValidPassword(String password){
        Pattern passwordPat = Pattern.compile(".{5,}");
        return passwordPat.matcher(password).matches();
    }

    public void addGrade(String facNum, String subject, int semNum, double grade){
        List<User> userList = FileManager.readFromFile();
        List<Grade> gradeList = null;
        for(User user: userList){
            if(user.getUsername().equals(facNum)){
                ((Student)user).addGrade(new Grade(subject,semNum,grade));
                break;
            }
        }
        FileManager.writeOnFile(userList);
    }
}
