import java.util.*;

public class Construct {
      
    int roll;
    String name;

    Construct(){
        System.out.println("this is non parametrized constructor");
    }
      Construct(int roll){
        this.roll=roll;
      }
       Construct(int roll,String name){
        this.roll=roll;
        this.name=name;
       }
         public static void main(String args[]){
            Construct c1=new Construct();
             Construct c2=new Construct(89);
              Construct c3=new Construct(78,"vivek");


            
         }
}
