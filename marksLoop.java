package JAVA;
import java.util.Scanner;

public class marksloop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        int marks = sc.nextInt();
        if(marks > 90){
            System.out.println("Excellent!");
        }
        else if (marks > 80){
            System.out.println("Good");
        }
        else if (marks > 70){
            System.out.println("Fair");
        }
        else if (marks > 60){
            System.out.println("Meet Expectations");
        }
        else{
            System.out.println("Par");
        
        }
    }
    
}
