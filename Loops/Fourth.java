import java.util.*;

public class Fourth {
    public static void main(String[] args) {
           System.out.println("enter the value of n");
           Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int i=1;
            int sum=0;
             while(i<=n){
                System.out.println(i);
                   sum=sum+i;
                     i++;
             }
               System.out.println(sum);

        

    }
    
}
