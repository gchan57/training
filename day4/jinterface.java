//not a class blueprint of class
//all methods are abstract method
//interface achives 100% method hidinng
//we can declare normal method with using default access modifier
//class interface inherit --> implements
//class class inherit --->extends
//interface interface --->extends
package day3;//folder
import day3.day34; //class or file in java
interface Parent{
    public void hi();
}

public class jinterface implements Parent  {
public void hi(){
    System.out.println("hi bud");
}
public static void main(String[] args){
Parent pa;
pa= new jinterface();
pa.hi();
day34 c=new day34();

}
}