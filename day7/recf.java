class recf{
public static int  fib(int a){
if(a==0||a==1){
    return a;
}
return fib(a-1)+fib(a-2);
}




public  static void main(String[] args){
    System.out.println(fib(4));
}
}
