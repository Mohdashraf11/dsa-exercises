import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args) {
        System.out.println("ENter the number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        input.close();
        int digit = 0;

        while (num != 0) {
            num = num/10;
            digit++;            
        }
        System.out.println(digit);
    }
}
