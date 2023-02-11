public class Main {
    public static void main(String[] args) {

        printSemiPyramid();
    }
    public static void printSemiPyramid(){
        int a = 3;
        for( int i  = 1; i <= a; i++){

//            System.out.println(" ".repeat(a-i-1) + "*".repeat(i + 1));
            System.out.println(" ".repeat(a-i) + "*".repeat(i));
        }
    }
}