import java.util.Scanner;

public class InverseNum {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int inv = 0;
        int originalPlace = 1;

        while (n>0) {
            int originalDigit = n % 10;
            int invertedDigit = originalPlace;
            int invertedPlace  = originalDigit;

            inv = inv + invertedDigit *(int)Math.pow(10, invertedPlace - 1);

            n = n/10;
            originalPlace++;
        }

        System.out.println(inv);
    }
}
