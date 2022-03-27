package dp;

import java.util.Arrays;

/**
 * LeetCode338
 * <p>
 * Counting Bits
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode338 {

    public static void main(String[] args) {
        LeetCode338 leetCode338 = new LeetCode338();
        System.out.println(Arrays.toString(leetCode338.countBits(10)));
    }

    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i / 2] + i % 2;
        }
        return dp;
    }

}
