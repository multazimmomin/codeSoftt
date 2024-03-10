package codeSoft;

import java.util.Random;
import java.util.Scanner;

public class guess {

    public static void main(String[] args) {
       
        int min = 1;
        int max = 100;

        Random random = new Random();

       int randomnumber = random.nextInt(max - min + 1) + min;

       Scanner scanner = new Scanner(System.in);

       System.out.println("random number between " + min + "and " + max + "; ");
       
       int userguess = scanner.nextInt();

       if (userguess==randomnumber) {

        System.out.println("print lajawaabbbb ");
        
       }
       else if (userguess<randomnumber) {
        System.out.println("slightly misseddd");
        
       }

       else{
        System.out.println("it is highhh highh");
       }


       scanner.close();










    }
    
}
