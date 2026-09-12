class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] t=new int[coins.length+1][amount+1];
                t[0][0]=0;
                for(int i=1;i<amount+1;i++){
                    t[0][i]=Integer.MAX_VALUE-1;
                       }
                 for(int i=1;i<coins.length+1;i++){
                    for(int j=1;j<amount+1;j++){
                        if(coins[i-1]<=j){
                            t[i][j]=Math.min(t[i-1][j],(t[i][j-coins[i-1]]+1));
                        }
                        else{
                            t[i][j]=t[i-1][j];

                        }
                    }
                }
                if (t[coins.length][amount] >= Integer.MAX_VALUE - 1) {
            return -1;
        }
            return t[coins.length][amount];
    }
}
