import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scn.nextInt();
        scn.close();
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }

    }
}
