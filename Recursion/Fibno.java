import java.util.*;

public class Fibno {
     public static int fib(int n){
         if(n==0 || n==1){
            return n;
         }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
     }
    public static void main(String[] args) {
         int term=6;
         for(int i=1;i<=term;i++){
           
                System.out.println(fib(i));
         }
    }
    
}
