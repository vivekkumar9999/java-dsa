// this program for call by value
import java.util.*;


public class Third {
    public static void value(int a){
            a=10;
        return ;
    }
    public static void main(String[] args) {
        int a=5;
        value(a);
        System.out.println("the value of a="+a);
    }
    
}
// in java all values are work as call by value beacause original value is not pass by parameter
// alwayas by the parameter only copy of the value is goes as the parameter
