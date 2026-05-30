import java.util.*;
public class Oop{
    String name;
    int rollno;
      
     Oop(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    
     }

      public static void main(String[] args) {
            Oop t1=new Oop("vivek", 90);
            System.out.println(t1.name);
            System.out.println(t1.rollno);

      }
}