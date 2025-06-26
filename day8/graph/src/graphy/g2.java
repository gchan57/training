package graphy;
import java.util.*;
public class g2{
    static int vertices;
    static List<List<Integer>> li=new LinkedList<List<Integer>>();
    public g2(int vertices){
        g2.vertices=vertices;
        for(int i=0;i<vertices;i++){
            li.add(new ArrayList<Integer>());
        }
    }
    public static void addedgeg1(int src,int dist){
        li.get(src).add(dist);
        li.get(dist).add(src);
    }
    public static void  dispg1(){
        for(int i=0;i<li.size();i++){
            for(int j=0;j<li.get(i).size();j++){
                System.out.print(li.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }
    public static void g2bfs(int start){
    boolean[] visited = new boolean[li.size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            List<Integer> neigh = li.get(current);

            for (int i = 0; i < neigh.size(); i++) {
                int data = neigh.get(i);
                if (!visited[data]) {
                    visited[data] = true;
                    queue.add(data);
                }
            }
        }
}
    
    public static void main(String[] args){
        g2 grp1=new g2(5);
     addedgeg1(0,1);
     addedgeg1(0,2);
     addedgeg1(0,3);
     addedgeg1(0,4);
     addedgeg1(1,2);
     addedgeg1(3,1);
     addedgeg1(3,4);
     dispg1();
     g2bfs(3);
    }
}