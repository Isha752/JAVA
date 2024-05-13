package JAVA;
import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
//Multiplication table of a number
        for(int i = 1; i<=10; i++){
            System.out.println(n*i);
        }
        
    }
    
}
