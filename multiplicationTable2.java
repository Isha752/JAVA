package JAVA;
import java.util.Scanner;

public class multiplicationtable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

//the multiplication table can also be printed like this
        int N=sc.nextInt();
        for(int i = 1; i<=10; i++){
        int result = N*i;
        System.out.printf("%d x %d = %d\n", N, i, result);     //this statement willpost the multiplication table in 2x2, 2x3.... form
        }
        
    }
    
}
