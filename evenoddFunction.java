import java.util.Scanner;

public class evenoddFunction {
    public static void evenoddNo(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenoddNo(n);
        
    }
    
}
 
