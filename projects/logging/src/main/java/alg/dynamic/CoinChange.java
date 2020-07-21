package alg.dynamic;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount){
        int max = amount + 1;
        int[] db = new int[amount + 1];
        Arrays.fill(db, max);
        db[0] = 0;
        for (int i = 1; i <= amount; i++) {
           for (int j = 0; j < coins.length; j++) {
               if(coins[j] <= i ){
                   db[i] = Math.min(db[i], db[i - coins[j]] + 1);
               }
           }
        }
        return db[amount] > amount ? -1 : db[amount];
    }

    public static void main(String[] args) {
        int[] coins = {2, 4,6};
        CoinChange cc = new CoinChange();
        cc.coinChange(coins, 11);
    }
}
