import java.util.*;
//tabulationn method
public class fibdp1 {
    public static int fib2(int n){
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args){
        System.out.println(fib2(5));
    }
}
