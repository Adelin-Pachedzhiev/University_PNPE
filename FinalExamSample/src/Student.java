import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Student extends User{
    private List<Grade> gradeList;

    public Student(String username, String password) {
        super(username, password);
        this.gradeList = new ArrayList<>();
    }

    public void addGrade(Grade grade){
        gradeList.add(grade);
    }

    @Override
    public UserRole getUserRole() {
        return UserRole.STUDENT;
    }

    public static boolean isValidUsername(String facNum){
        Pattern usernamePat = Pattern.compile("[0-9]{9}");
        return usernamePat.matcher(facNum).matches();
    }
    public static boolean isValidPassword(String egn){
        Pattern pattern = Pattern.compile("[0-9]{10}");
        return pattern.matcher(egn).matches();
    }

    public String printGrades(){
        StringBuilder result = new StringBuilder();
        Collections.sort(gradeList);
        for(Grade grade:gradeList){
            result.append(grade);
        }
        return result.toString();

    }
}
