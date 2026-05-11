import java.util.*;

public class Second {
     public static int calculatesum( int num1,int num2){
        int sum =num1+num2;
        return sum;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        int a=sc.nextInt();
        System.out.println("enter  your second number");
        int b=sc.nextInt();
         int sum= calculatesum(a,b);
         System.out.println("your sum is="+sum);
     }
    
}
