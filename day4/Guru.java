class Harish{
    private static int age;
    private static long ph;
    Harish(int a,long po)
    {
        this.age=a;
        this.ph=po;
    }
    void display(){
        System.out.println(ph);
        System.out.println(age);
    }
}
public class  Guru extends Harish{
Guru(int a ,long b){
    super(a,b);
}
public static void main(String[] args){
    Guru gu=new Guru(5,456);
    System.out.println();
    gu.display();
}
}