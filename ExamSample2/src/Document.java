import javax.print.Doc;
import java.util.Objects;

public class Document {
    private String name;
    private double grade;
    private double income;
    private String faculty;
    private ScholarshipType type;

    public ScholarshipType getType() {
        return type;
    }

    public Document(String name, double grade, double income, String faculty, ScholarshipType type) {
        this.name = name;
        this.grade = grade;
        this.income = income;
        this.faculty = faculty;
        this.type = type;

    }

    @Override
    public String toString(){
        return name + " " + grade + " " + income + " " + faculty;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public double getIncome() {
        return income;
    }

    public String getFaculty() {
        return faculty;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || !(o instanceof Document)){
            return false;
        }
        Document currDocument = (Document) o;
        return this.name.equals(currDocument.getName()) && grade == currDocument.getGrade() && income == currDocument.getIncome() && faculty.equals(currDocument.getFaculty()) && type.equals(currDocument.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, income, faculty, type);
    }
}
