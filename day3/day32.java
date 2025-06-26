import java.util.*;
public class day32 {
    public void number(int a,int b){
        System.out.println(a+b);
    }
    public int rnumber(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        day32 d1=new day32();
        d1.number(2,3);
        System.out.println(d1.rnumber(8,9));
    }
    
}
