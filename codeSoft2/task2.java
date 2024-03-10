package codeSoft2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of subject");
        int numSubject = scanner.nextInt();

        int[] marks = new int[numSubject];
        int totalmarks = 0;

        for (int i = 0 ; i < numSubject ; i++){
            System.out.println("Enter marks obtained in marks " + (i+1) + ";");
        marks[i] = scanner.nextInt();
        totalmarks+=marks[i];
        }
        // Calculate Total Marks: Sum up the marks obtained in all subjects
        System.out.println("Total Marks Obtained: " + totalmarks);

        // Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage
        double averagePercentage = (double) totalmarks / numSubject;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Grade Calculation: Assign grades based on the average percentage achieved
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user
        System.out.println("Grade: " + grade);

        scanner.close();
            
        
        



    }
    
}
