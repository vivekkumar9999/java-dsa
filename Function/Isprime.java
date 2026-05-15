public class Isprime {
     public static boolean Primecheck(int n){
       boolean  Primecheck=true;
        for(int i=2;i<=n-1;i++){
              if(n%i==0){
                Primecheck=false;
                 break;
              }
        }
         return Primecheck;

     }
    public static void main(String[] args) {
         System.out.println(Primecheck(12));
    }
    
}
