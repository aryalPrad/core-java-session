package assignments;
import java.util.Scanner;
public class PercentageCalculator {
    public static  void main(String[] args){
        System.out.println("Enter the marks obtained in Math: ");
        Scanner sc = new Scanner(System.in);
        double math = sc.nextDouble();
        System.out.println("Enter the marks obtained in English: ");
        double english = sc.nextDouble();
        System.out.println("Enter the marks obtained in Science: ");
        double science = sc.nextDouble();
        System.out.println("Enter the marks obtained in Geography: ");
        double geography = sc.nextDouble();
        System.out.println("Enter the marks obtained in History: ");
        double history = sc.nextDouble();
        double fullMark = 500;
        double obtainedMarks = math+science+english+history+geography;
        double percentage = (obtainedMarks/fullMark)*100;
        System.out.println("Your percentage is " + percentage);
        if (percentage>= 80){
            System.out.println("Distinction");
        } else if (percentage>=70) {

            System.out.println("First Divison");
        }
        else {
            System.out.println("Second Divison");
        }
    }
}
