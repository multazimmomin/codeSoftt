package codeSoft;

import java.util.Random;
import java.util.Scanner;

public class loop {


    public static void main(String[] args) {
        
    int min = 1;
    int max = 100;

    Random random = new Random();

    int randomnumber = random.nextInt(max - min + 1 ) + min;

    Scanner scanner = new Scanner(System.in);

int userguess ;


   do{
    System.out.println("guess it correctlyy " + min + " and " + max + "; ");
    userguess = scanner.nextInt();

    if (userguess==randomnumber) {
        System.out.println("Correcttttt lajawabbb");
        
    }
    else if (userguess<randomnumber) {
        System.out.println("Slightly lower");
        
    }
   else {
System.out.println("it is highhh highh");
   }

}while (userguess!=randomnumber);
   
    
   

        
  
scanner.close();

        
   
    



}
}


