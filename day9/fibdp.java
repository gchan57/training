import java.util.Arrays;
// memoization method
public class fibdp{
    public static int feb(int[] ref,int n){
        if(n<=1){
            return ref[n]=n;
        }
        if (ref[n]!=-1){
            return  ref[n];
        }
        ref[n]= feb(ref,n-1)+feb(ref,n-2);
        return ref[n];
    }
    public static void main(String[] args){

        int n=7;
        int[] ref= new int[n+1];
        Arrays.fill(ref,-1);//or use loop
        System.out.println(feb(ref,n));
    }
}