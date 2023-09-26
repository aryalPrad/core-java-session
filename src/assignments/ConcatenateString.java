package assignments;
import java.util.Scanner;
public class ConcatenateString {
    public static void main(String[] args){
        System.out.println("Enter the number to concatenate String between 0 to 50000");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String output;
        if (n>0 && n<= 50000){
            if(n % 2 != 0) {
                output = "a".repeat(n);
            }
            else{
                output="a".repeat(n-1) + "X";
            }

            System.out.println(output);
        }
        else{
            System.out.println("Enter valid range");
        }
    }
}
