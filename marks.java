package JAVA;
import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int choice;
        do{
            System.out.println("Enter your marks: ");
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            }else if(marks>=60){
                System.out.println("This is also Good");
            }else if(marks>=0){
                System.out.println("This is Good as well");
            }else{
                System.out.println("Invalid!!");
            }

        System.out.println("Want to continue (1)Yes or (0)No: ");
        choice = sc.nextInt();
            
        }while(choice==1);

    }
    
}
