public class Main {
    public static void main(String[] args) {
        Student student1 =
                new Student("Kiril", "Dimitrov", "Vasilev", "13.03.1999", "12122121", 3.4, 5.3, 5.0);
        student1.setPE(6.0);

        System.out.println("Names: " + student1.getFirstName() + " " + student1.getSecondName() + " " + student1.getLastName());
        System.out.println("birthday: " +student1.getBirth_date());
        System.out.println("faculty num: " + student1.getfNum());
        System.out.println("ocenki:");
        System.out.println("PIK: " + student1.getPIK());
        System.out.println("PE: " + student1.getPE());
        System.out.println("PPE: " + student1.getPPE());
    }
}