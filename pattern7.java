import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n+1) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
