package dp;

/**
 * LeetCode070
 * Climbing Stairs
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode070 {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n - 1];
    }

    public int climbStairs2(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        return climbStairs2(n - 1) + climbStairs2(n - 2);
    }
}
