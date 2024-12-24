import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.err.print("Please enter your marks: ");
        int marks = scn.nextInt();
        System.out.println( marks);

       if (marks>90) {
            System.out.println("Excellent");        
       } else if(80<marks && marks<=90) {
            System.out.println("Good");       
       }else if (marks>70 && marks<=80) {
            System.out.println("Fair");
       }else if (marks>60 && marks<=70) {
            System.out.println("Meets Expectation");
       }else {
            System.out.println("below par");
       }
       scn.close();
    }
}