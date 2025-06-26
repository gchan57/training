//Arraylist
import java.util.*;
import java.lang.reflect.*;// to find capacity this library is used 
class day51{
   
    
    public static void main(String[] args){
        ArrayList<Integer> arl=new ArrayList<>();
        System.out.println(arl.size());
        arl.add(6);
        arl.add(34);
        System.out.println(arl);
        System.out.println(arl.get(1));
        System.out.println(arl.isEmpty());
        Object[] i=arl.toArray();
        System.out.println(i[0]);//object      
    }
}