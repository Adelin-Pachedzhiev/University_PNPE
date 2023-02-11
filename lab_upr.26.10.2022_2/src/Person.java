public class Person {
    String fistName;
    String secondName;
    String lastName;
    String birth_date;

    public Person(){
        this.fistName = "";
        this.secondName = "";
        this.lastName = "";
        this.birth_date = "";
    }
    public Person(String fname, String sName, String lName, String bDate){
        this.fistName = fname;
        this.secondName = sName;
        this.lastName = lName;
        this.birth_date = bDate;
    }

    public void setFirstName(String n){
        this.fistName = n;
    }
    public String getFirstName(){
        return this.fistName;
    }

    public void setSecondName(String n){
        this.secondName = n;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public void setLastName(String n){
        this.lastName = n;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String getBirth_date() {
        return this.birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
}
