public class Teacher extends Person{
    Course course;
    public Teacher(String name, String egn, Course course){
        super(name,egn);
        this.course = course;
    }

    public void setCourse(Course course){
        this.course = course;
    }
    public Course getCourse(){
        return this.course;
    }
}
