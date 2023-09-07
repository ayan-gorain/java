package days100;
import java.util.Scanner;

public class average_2_no {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a");
       int a=sc.nextInt();
       System.out.println("Enter b");
       int b=sc.nextInt();
       System.out.println("Enter c");
       int c=sc.nextInt();
       double avg= (double) (a + b + c) /3;
       System.out.println(avg);

   }

}
