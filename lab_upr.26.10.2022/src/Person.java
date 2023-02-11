public class Person {
    private String name;
    private String egn;
    public Person(){
        this.name = "";
        this.egn = "";
    }
    public Person(String n, String e){
        this.name = n;
        this.egn = e;
    }
    public void sayName(){
        System.out.println("My name is: " + this.name);
    }
    public static void sayHi(){
        System.out.println("hello");
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEgn(){
        return this.egn;
    }
    public void setEgn(String egn){
        this.egn = egn;
    }
}
