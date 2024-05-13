public class ps1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double x = sc.nextInt();
        int n = sc.nextInt();
        double result = Math.pow(x, n);
        System.out.println("The value of one number raised to the power of another is: " + result);
