import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        scn.close();

        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        


    }
}
