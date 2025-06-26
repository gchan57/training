
class rec2{
public static int  ia1(int a){
    if(a>=5){
        return a;
    }
    else{
        return  a+ia1(++a);
    }
    }
public static void main(String[] args){
    System.out.println(ia1(1));
}
}