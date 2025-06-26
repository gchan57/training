abstract class her{
    //normal method
    //method overriding
    // can't achive 100% method overriding 
    public static void hii(){

    }
    public abstract  void welcome();
}
public class aclass extends her {
    public void welcome(){
        System.out.println("holla");
    }
    public static void main(String[]  args){
        her h;//abstract
        h=new aclass();//child
        h.welcome();
    }
}
