// wap for check the number is negative or not
import java.util.*;
public class First{
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
            System.out.println("number is positive");
        }
         else{
            System.out.println("number is nagative");
         }
    }
}