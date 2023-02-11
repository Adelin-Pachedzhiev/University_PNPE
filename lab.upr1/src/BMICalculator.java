import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class BMICalculator {
    public static void printIntroduction(){
        System.out.println("Welcome ! This programme calculates Body mass index(BMI)");
    }
    public static double getBMI(Scanner sc){
        double height, weight;
        System.out.println("enter your height in inches:");
        height = sc.nextDouble();
        System.out.println("enter your weight in pounds:");
        weight = sc.nextDouble();
        return bmiFor(height, weight);
    }
    public static double bmiFor(double height, double weight){
        double bmi =  (weight*703)/(height*height);
        return bmi;
    }
    public static String getStatus(double index){
        if(index <= 18.5){
            return "underweight";
        } else if(index <= 25 ){
            return "normal";
        } else if(index <= 30){
            return "overweight";
        } else {
            return "obese";
        }
    }
    public static void reportResult(int resultNum, double bmi, String status){
        System.out.printf("Result for result number %d\n", resultNum );
        System.out.printf("BMI index: %d\n", Math.round(bmi) );
        System.out.printf("Your status is:  %s\n",status );
    }
}
