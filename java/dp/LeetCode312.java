package dp;

/**
 * LeetCode312 Burst Balloons
 *
 * @author qiang.xu
 * @since 2022/3/21
 */
public class LeetCode312 {
    public static void main(String[] args) {
        int res = maxCoins(new int[]{3, 1, 5, 8});
        System.out.println(res);
    }

    public static int maxCoins(int[] nums) {
        int[] newNums = new int[nums.length + 2];
        int len = newNums.length;
        newNums[0] = 1;
        newNums[len - 1] = 1;
        System.arraycopy(nums, 0, newNums, 1, len - 2);
        int[][] cost = new int[len][len];

        for (int low = len - 1; low >= 0; low--) {
            for (int high = low + 1; high < len; high++) {
                for (int k = low + 1; k < high; k++) {
                    int thisCost = cost[low][k] + cost[k][high] + newNums[low] * newNums[k] * newNums[high];
                    cost[low][high] = Math.max(cost[low][high], thisCost);
                }
            }
        }

        return cost[0][len - 1];
    }
}
