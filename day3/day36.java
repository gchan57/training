
//super
//helps to access method,constructor,
import java.util.*;
 class daythree1 {
    public daythree1(){
        System.out.println("parent cons");
    }
    public void today1(){
    System.out.println("Parent");
    }
}
class daythree2 extends daythree1{
    public daythree2(){
        //output is due to hidden super() in this line
        System.out.println("child cons");
    }
    public void today(){
    System.out.println("child");
    super.today1();
    }
}
public class day36{
public static void main(String[] args){
    daythree2 i= new daythree2();
    i.today();
}


}
