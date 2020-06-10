/**
 * You are given coins of different denominations and a total amount of money. Write a function to compute the number of 
 * combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
 * Input: amount = 5, coins = [1, 2, 5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1
 */

public class coinChange2 {
    public int change(int amount, int[] coins) {
       
        int arr[] = new int[amount+1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        for(int c : coins)
            for(int i = c; i <= amount; i++)
                arr[i] += arr[i-c];
        return arr[amount];
    }
}