//String upper to lower lower to upper
import java.util.*;
public class day21{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    char[] ch=name.toCharArray();
    for(int i=0;i<name.length();i++){
        int c=(int) ch[i];
        if(c>=65&&c<=92){
            c=c+32;
            ch[i]=(char) c;
            continue;
        }
        c=c-32;
        ch[i]=(char) c;
        
    }
        String h =new String(ch);
        System.out.print(h);
}
}