import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        scn.close();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        


    }
}
