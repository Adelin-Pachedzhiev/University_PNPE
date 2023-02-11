public class Student extends Person{
    String fNum;
    double PIK;
    double PE;
    double PPE;

    public Student(String fname, String sName, String lName, String bDate, String fNum, double PIK, double PE, double PPE){
        super(fname,sName,lName,bDate);
        this.fNum = fNum;
        this.PE = PE;
        this.PIK = PIK;
        this.PPE = PPE;
    }

    public String getfNum() {
        return this.fNum;
    }

    public void setfNum(String fNum) {
        this.fNum = fNum;
    }

    public double getPIK() {
        return this.PIK;
    }

    public void setPIK(double PIK) {
        this.PIK = PIK;
    }

    public double getPE() {
        return PE;
    }

    public void setPE(double PE) {
        this.PE = PE;
    }

    public double getPPE() {
        return this.PPE;
    }

    public void setPPE(double PPE) {
        this.PPE = PPE;
    }
}
