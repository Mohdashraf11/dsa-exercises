import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.print("print first num: ");
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        System.out.print("Enter Second num: ");
        int n2 = scn.nextInt();
        scn.close();

        int on1 = n1;
        int on2 = n2;

        while (n1%n2 != 0) {
            int remainder = n1%n2;
            n1 = n2;
            n2 = remainder;
        }
        int Gcd = n2;
        int Lcm = (on1 * on2) / Gcd;

        System.out.println(Gcd);
        System.out.println(Lcm);
    }
}
