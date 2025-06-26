//sigle inheritance
import java.util.*;
 class daythree1 {
    public void today1(){
    System.out.println("Parent");
    }
}
class daythree2 extends daythree1{
    public void today(){
    System.out.println("child");
    }
}
public class day35{
public static void main(String[] args){
    daythree2 i= new daythree2();
    i.today();
    i.today1();
}
}



