public class Occurence{
     public static int Occur(int arr[],int key,int i){
         if(i==arr.length){
            return -1;
         }
        if(arr[i]==key){
            return i;
        }
         return Occur(arr, key, i+1);
     }
    public static void main(String[] args) {
          int arr[]={1,2,4,5,3,7,8,9};
          System.out.println(Occur(arr, 6, 0));
    }
}