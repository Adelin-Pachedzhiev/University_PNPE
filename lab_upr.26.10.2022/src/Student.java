public class Student extends Person{
    private String fNum;

    public Student(){
        super();
        this.fNum = "";
    }
    public Student(String n, String e, String f){
        super(n, e);
        this.fNum = f;
    }
    public String getFnum(){
        return this.fNum;
    }
    public void setFnum(String fNum){
        this.fNum = fNum;
    }

}
