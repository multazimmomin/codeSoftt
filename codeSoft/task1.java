package codeSoft;

import java.util.Random;

public class task1 {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        Random ran = new Random();

        int randomnumber = ran.nextInt(max-min+1)-min;

        System.out.println("ranom number between " +  min  +  " and "  +  max + " ; " + randomnumber);



        




    }

    
}