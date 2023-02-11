import java.io.Serializable;

public class Grade implements Serializable,Comparable<Grade> {
    private String subject;
    private int semesterNum;
    private double grade;

    public Grade(String subject, int semesterNum, double grade) {
        this.subject = subject;
        this.semesterNum = semesterNum;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSemesterNum() {
        return semesterNum;
    }

    public void setSemesterNum(int semesterNum) {
        this.semesterNum = semesterNum;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public int compareTo(Grade grade){
        int intComp = Integer.compare(this.semesterNum, grade.semesterNum);
        if (intComp == 0){
            return this.subject.compareTo(grade.subject);
        }
        return intComp;
    }

    public String toString(){
        return this.subject +" "+ this.grade+" "+ this.semesterNum;
    }

}

