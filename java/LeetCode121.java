/**
 * LeetCode121
 * Best Time to Buy and Sell Stock
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode121 {

    public static void main(String[] args) {
        LeetCode121 leetCode121 = new LeetCode121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = leetCode121.maxProfit2(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        int len = prices.length;

        int[] dp = new int[len];
        dp[0] = 0;
        int max = 0;

        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + prices[i] - prices[i - 1], 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        int len = prices.length;

        int max = 0;
        int maxCur = 0;
        for (int i = 1; i < len; i++) {
            maxCur = Math.max(0, maxCur + prices[i] - prices[i - 1]);
            max = Math.max(maxCur, max);
        }
        return max;
    }

    public int maxProfit3(int[] prices) {
        int len = prices.length;
        int max = 0;
        int minSoFar = prices[0];
        for (int i = 1; i < len; i++) {
            if (prices[i] > minSoFar) {
                max = Math.max(prices[i] - minSoFar, max);
            } else {
                minSoFar = prices[i];
            }
        }
        return max;
    }

}
