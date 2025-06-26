import java.util.*;
class multidlist{
public static void main(String[] args){
List<List<Integer>> li = new ArrayList<>();
System.out.println(li);
List<Integer> a=new ArrayList<>();
a.add(1);
a.add(2);
a.add(3);
li.add(a);
List<Integer> b = new ArrayList<>();
b.add(5);
b.add(6);
b.add(7);
li.add(b);
System.out.println(li);
for(int i=0;i<li.size();i++){
    System.out.print(li.get(i) + " ");
    for(int j=0;j<li.get(i).size();j++){
        System.out.print(li.get(i).get(j) + " ");
    }
}
System.out.println();
 for(List<Integer> i:li){
            
                System.out.println(i);

}}}