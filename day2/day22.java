import java.util.*;
public class day22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cond=sc.nextInt();
        int sum=0;
        String s=sc.next();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c=ch[i];
            if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')&&cond==0){
                continue;
            }
            int val=((c>='a'&&c<='z')||(c>='A'&&c<='Z'))?( (int)c-96):((int)c -64);
            sum=sum+val;
        }
        System.out.println(sum);
    }
}
