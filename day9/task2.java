//minnimum number jump
import java.util.Arrays;
public class task2 {
    public static int findmin(int[] arr){
        int[] test = new int[arr.length];
        Arrays.fill(test,arr.length);
        test[0]=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr.length){
                for(int j=1;j<=arr[i];j++){
                    if(j<arr.length&&((i+1)<arr.length)){
                    test[i+1]=test[i-1]+1;
                    }
                }
            }
        }
        return test[arr.length-1];
    }

    public static void main(String[] args){
        int[] a={1,4,3,1,2,0,7,8,6};
       System.out.println(findmin(a));
    }
}
//7,[1 3 5 8 9 2 6] ans=3
//9,[1,4,3,1,2,0,7,8,6] ans=4

