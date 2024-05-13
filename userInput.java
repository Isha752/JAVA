package JAVA;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

//taking integer as input
        System.out.println("Enter an Integer: ");
        int n = Integer.parseInt(sc.nextLine());        //when using both string and integer, integer input should be written like this
        // int n = sc.nextInt();
        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }

//taking string as input
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

    }
}
