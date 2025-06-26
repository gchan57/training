//frequency question
import java.util.Scanner;
public class day2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr=new int[10];
        int t=l;
        int i=0;
        int c=0;
        while(t!=0)
        {   int a=t%10;
            arr[a]=arr[a]+1;
            i=i+1;
            t=t/10;

        }
        for(int j=0;j<9;j++){
            if(arr[j]!=0){
                c=c+1;
            }
        }
        System.out.println(c);
        
}}
