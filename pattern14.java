import java.util.*;
public class pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter the number: ");
        
        int x = scn.nextInt();
        
        for(int i = 1; i <= 10; i++){
            int v = x * i;
            System.out.println(x + " * " + i + " = " + v );
        }
        scn.close();
    }
}
