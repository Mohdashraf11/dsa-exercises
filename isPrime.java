import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        System.out.print("Enter the number of test cases: ");
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            System.out.print("Enter a number: ");
            int n = scn.nextInt();
            
            int count = 0;
            for (int div = 2; div*div <= n; div++) {
                if (n % div == 0) { // Check if div is a divisor of n
                    count++;
                    break;
                }
            }
            
            if (count == 0) { // If there are exactly 2 divisors, n is prime
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
        scn.close();
    }
}
