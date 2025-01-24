/*
 *  You are given an array prices where prices[i] is the price of a given stock 
on the ith day. 
Return the maximum profit you can achieve from this transaction. If you cannot 
achieve any profit, return 0. 
Example 1: 
Input: 
prices = [7, 1, 5, 3, 6, 4] 
Output:  5
 */
public class ShareBuyandSell {
    public static int buyAndsell(int prices[]) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, prices[i]);
            }

            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum profit is = " + buyAndsell(prices));

    }
}
