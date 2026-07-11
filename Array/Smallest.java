import java.util.*;
public class Smallest {
     public static int small(int arr[]){
              int value=Integer.MAX_VALUE;
              for(int i=0;i<arr.length;i++){
                if(value>arr[i]){
                    value=arr[i];
                }
              }
              return value;
     }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,1};
          int Result =  small(arr);
          System.out.println("the smallest value="+Result);
    }
    
}
