public class Last{
      public static int Occur(int arr[],int key,int i){
          if(i==arr.length){
            return -1;
          }
        int isfound=Occur(arr, key, i+1);
         if(isfound==-1 && arr[i]==key){
            return i;
         }
          return isfound;

      }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,4,9};
        System.out.println(Occur(arr, 4, 0));
    }
}

