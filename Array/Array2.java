import java.util.*;
public class Array2 {
     public static void Update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
     }
    public static void main(String[] args) {
        int arr[]={10,11,12};
        Update(arr);
         for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]);
         }
         System.out.println();
    }
    
}
