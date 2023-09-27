package assignments;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StringSplit {
    public static void main(String[] args){

        try{
            String input ="5 12  \n";
            String[] splitInput = input.trim().split(" ");
            StringBuilder outputString=new StringBuilder();

            for (int i = parseInt(splitInput[0]); i< parseInt(splitInput[splitInput.length-1]); i++){
                if(i % 5 == 0){
                    outputString.append(i);
                    outputString.append(" ");
                    i+=4;
                }
            }

            System.out.println(outputString);


        } catch (Exception e) {
            System.out.println("Please check the inputs");
        }

    }
}
