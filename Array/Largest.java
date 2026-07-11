import java.util.*;
public class Largest{
      public static int Result(int arr[]){
        int number=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(number<arr[i]){
                   number=arr[i];
            }
        }
        return number;
      }
    public static void main(String[] args) {
          int arr[]={12,34,45,56,77};
             int Final= Result(arr);
             System.out.println("the largets number is="+Final);
    }
}