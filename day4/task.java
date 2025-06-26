import java.util.*;
public class task {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t1=a;
        int t2=b;
        int c=0;
        int[] arr1=new int[10];
        int[] arr2=new int[10];
       for(int i=0 ;t1>0&&t2>0;i++){
            int s1=t1%10;
            int s2=t2%10;
            arr1[i]=s1;
            arr2[i]=s2;
            t1=t1/10;
            t2=t2/10;
        }
        for(int i=0;i<10;i++){
            if((arr1[i]+arr2[i])>9){
                c=c+1;
            }
             if((arr1[i]+arr2[i])>=10){
                arr1[i+1]=arr1[i+1]+1;
            }
        }
        System.out.println(c);
    }
}
