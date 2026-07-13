public class ArrayBinary{
     public static int BinarySearch(int arr[],int key){
        int start=0 ;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+end/2;
            if(arr[mid]==key){
                return mid;
            }
              if(arr[mid]<key){
                  start=mid+1;
              }
              else{
                end=mid-1;
              }
        }
        return -1;
     }
    public static void main(String[] args) {
        int arr[]={12,23,45,67,89};
        int key=23;
        System.out.println("the key is at index:"+BinarySearch(arr, key));
    }
}