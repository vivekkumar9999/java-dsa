public class PrimeInRange {
      public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            isPrime=false;
              break;
        }
           return isPrime;
      }
        public static void Range(int n){
            for(int i=2;i<=10;i++){
                if(isPrime(i)){
                    System.out.println(i+"");
                }
            }
            System.out.println( ) ;
        }
              


     public static void main(String[] args) {
             Range(10);
     }
    
}
