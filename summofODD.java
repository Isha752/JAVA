public class ps1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int b = 0;
        for(int i=1;i<=n;i+=2){
            b += i;
        }
        System.out.println("The sum of odd numbers is: "+ b);
