/**
 * LeetCode053
 * Maximum Subarray
 *
 * @author qiang.xu
 * @since 2022/3/26
 */
public class LeetCode053 {

    public static void main(String[] args) {

    }

    /**
     * BF -- O(n^2)
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int curMax = nums[i];
            int curSum = nums[i];
            for (int j = i + 1; j < len; j++) {
                curSum += nums[j];
                if (curSum > curMax) {
                    curMax = curSum;
                }
            }
            if (curMax > max) {
                max = curMax;
            }
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for (int num : nums) {
            curSum += num;
            if (curSum > max) {
                max = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return max;
    }

    public int maxSubArray3(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = nums[i] + (Math.max(dp[i - 1], 0));
            max = Math.max(dp[i], max);
        }
        return max;
    }

}
