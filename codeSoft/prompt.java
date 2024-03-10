package codeSoft;

import java.util.Random;
import java.util.Scanner;

public class prompt {


    public static void main(String[] args) {
        
     int min = 1;
     int max = 100;

     Random random = new Random();

     int randomnumber = random.nextInt(max-min+1)+min;
     

     System.out.println("random number between " + min + " and " + max + ";");


     Scanner scanner = new Scanner(System.in);

     System.out.println("The number is " + randomnumber);
    int userguess = scanner.nextInt();


   if (userguess==randomnumber) {
     System.out.println("it is correct number" + randomnumber);    
   }
   else{
    System.out.println("it is not correct " + randomnumber);
   }



   scanner.close();

    }

    
    
}
