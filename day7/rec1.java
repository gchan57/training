
class rec1{
public static int  ia(int a){
    if(a<=1){
        return a;
    }
    else{
        return  a*ia(a-1);
    }
    }
public static void main(String[] args){
    System.out.println(ia(5));
}
}