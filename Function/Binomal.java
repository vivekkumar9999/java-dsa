public class Binomal {
     public static int Factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
          return f;
     }
    public static int BionamlCoffi(int n,int r){
        int n_fact=Factorial(n);
        int r_fact=Factorial(r);
        int n_rfact=Factorial(n-r);
        int   BionamlCoffi=n_fact/(r_fact*n_rfact);
           return  BionamlCoffi;

    }
    
    public static void main(String[] args) {
            
             int Final= BionamlCoffi(5,2);
             System.out.println(Final);
    }
    
}
