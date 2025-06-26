// to give changes with minimum coin for given value(amount) with given set of coins
import java.util.*;
public class task1alte {
    public static int minCoin(int[] coins,int rup,int[] dp){
        if(rup==0) return 0;
        if(dp[rup]!=-1) return dp[rup];
        int res=Integer.MAX_VALUE;
        for(int coin:coins){
            if(coin<=rup){
                int subres=minCoin(coins,rup-coin,dp);
                if(subres!= Integer.MAX_VALUE){
                    res=Math.min(res,subres+1);
                }
            }
        }
        dp[rup]=res;
        return dp[res];
    }
    public static void main(String[] args){
        int[] arr={9,6,5,1};
        int n=56;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(minCoin(arr,n,dp));
    }
}
//27,56,11,3
