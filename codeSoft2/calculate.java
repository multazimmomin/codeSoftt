package codeSoft2;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i+1) + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        System.out.println("The total marks obtained are: " + totalMarks);
    }
}
    

