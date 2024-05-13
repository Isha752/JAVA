package JAVA;
public class addsubmuldivmod2 {
    public static void main(String[] args) throws Exception {
        int x = 15;
        int y = 10;
        //ADDITION
        int sum = x + y;
        System.out.println("The Addition is: "+ sum);
        //MULTIPLICATION
        int mul = x * y;
        System.out.println("The product is: " + mul);
        // DIVISION
        int v1 = x/y;
        int v2 = y/x;
        int v3 = x % y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        //EXPONENT
        int exp = mul/sum;  
        int exp1 = x * y/ x+y;        //<-- This statement will provide wrong answer as it wont follow bodmass rule
        //To follow the bodmass rule we can write it as 
        int exp2 = (x*y)/(x+y);
        System.out.println("The Exponents is: "+ exp);
        System.out.println(exp1);
        System.out.println(exp2);
    }
    
}
