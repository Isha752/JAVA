package JAVA;
import java.util.Scanner;

public class primeNumberFunction {
    public static void primeNumber(int n){
        int count = 0;
        for(int div = 2; div * div <=n;div++){
            if(n % div == 0){
                count ++;
            }
        }
        if (count == 0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        return;
    }
    
        public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           primeNumber(n);
        }
    }

