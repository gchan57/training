package graphy;
//queue based
import java.util.ArrayDeque;
import java.util.Queue;

public class g1{
static int vertices;
static int [][] admax;
g1(int vertices){
    g1.vertices=vertices;
    g1.admax=new int[vertices][vertices];;
}
public static void addedge (int src, int des)
{
    admax [src][des]=1;
    admax [des][src]=1;
}
public static void disp(){
    for (int i=0;i<vertices;i++){
        for(int j=0;j<vertices;j++){
            System.out.print(admax[i][j]+" ");
        }
        System.out.println();
    }
}
public static void g1bfs(int start){
boolean[] visited=new boolean[vertices];// all false 
Queue<Integer> data=new ArrayDeque<>();
visited[start]=true;
data.add(start);
System.out.println("bfs:");
while(!data.isEmpty()){// comes in when queue is not emp
    int current=data.poll();
    System.out.print(current+" ");
    for(int i=0;i<vertices;i++){
            if(admax[current][i]==1&& !visited[i]){
                visited[i]=true;
                data.add(i);
            }
    }
}
}
public static void g1dfslogic(boolean[] visited ,int start){
    visited[start]=true;
    System.out.print(start+" ");
    for(int i=0;i<vertices;i++){
        if(admax[start][i]==1&&!visited[i]){
            g1dfslogic(visited,i);
        }
    }
}
public static void  g1dfs(int start){
    System.out.println("dfs");
    boolean[]    visited=new boolean[vertices];
    g1dfslogic(visited,start);
}
public static void main(String[] args){
g1 gra =new g1(6);
// addedge(0,1);
// addedge(0,2);
// addedge(0,3);
// addedge(0,4);
// addedge(1,2);
// addedge(3,1);
// addedge(3,4 );

//g1bfs(3);
addedge(0,1 );
addedge(1,3);
addedge(1,2);
addedge(2,4);
addedge(3,4);
addedge(4,5);
disp();
g1bfs(0);
System.out.println();
g1dfs(0);
}

}
  