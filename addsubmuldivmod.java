import java.util.Scanner;

public class addsubmuldivmod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers to perform operations on: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Addition of two numbers is: " + sum);
        int mul = a * b;
        System.out.println("The Multiplication of two numbers is: " + mul);
        int div = a/b;
        System.out.println("The Division of two numbers is: " + div);
        int sub = a-b;
        System.out.println("The Subtraction of two numbers is: " + sub);
        int mod = a%b;
        System.out.println("The Modulo/Remainder of two numbers is: " + mod);
    }
    
}
