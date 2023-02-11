public class Test {
    public static void main(String[] args){
        Teacher[] teachers = {
                new Teacher("Ivan", "090232", new Course("PNPE")),
                new Teacher("Georgi", "0123123", new Course("MAT")),
                new Teacher("Maria", "03412312", new Course("PPE"))
        };

        for(Teacher t: teachers){
            System.out.println("Teacher's name: " + t.getName());
            System.out.println(("Teacher's EGN: " + t.getEgn()));
            System.out.println("Teacher's course: " + t.getCourse().getName());
        }
    }
}
