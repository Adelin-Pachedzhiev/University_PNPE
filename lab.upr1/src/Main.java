import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BMICalculator.printIntroduction();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter result number");
        int resultNum = sc.nextInt();

        double bmi = BMICalculator.getBMI(sc);
        String status = BMICalculator.getStatus(bmi);
        BMICalculator.reportResult(resultNum, bmi, status);

    }

}