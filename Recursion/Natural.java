import java.util.*;

public class Natural {
     public static int num(int n){
          if(n==1){
            return 1;
          }
         int num1= num(n-1);
         int ans=n+num(n-1);
          return ans;
     }
    public static void main(String[] args) {
           System.out.println(num(5));
    }
    
}
