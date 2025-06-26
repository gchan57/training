import java.util.*;
class javaiter{
    public static void main(String[] args){
        List<Integer> zero=new ArrayList<Integer>();
        zero.add(1);
        zero.add(2);
        zero.add(3);
        Iterator<Integer> it=zero.iterator();
        while(it.hasNext()){
            Integer a=it.next();
            System.out.println(a);
        }
    }
}