package JAVA;
import java.util.Scanner;

public class multiplicationFunction {
    public static void multiplyTable(int n){
        for(int i = 1; i<=10; i++){
            int result = n * i;
            System.out.printf("%d x %d = %d\n", n , i, result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiplyTable(n);
    }
    
}
