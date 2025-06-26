// to give changes with minimum coin for given value(amount) with given set of coins
import java.util.*;
public class task1 {
    public static int minCoin(int[] coins,int rup){
        if(rup==0) return 0;
        int res=Integer.MAX_VALUE;
        for(int coin:coins){
            if(coin<=rup){
                int subres=minCoin(coins,rup-coin);
                if(subres!= Integer.MAX_VALUE){
                    res=Math.min(res,subres+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={9,6,5,1};
        System.out.println(minCoin(arr,56));
    }
}
//27,56,11,3