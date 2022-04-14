package dp;

/**
 * LeetCode746
 * <p>
 * Min Cost Climbing Stairs
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode746 {

    public static void main(String[] args) {
        LeetCode746 leetCode746 = new LeetCode746();
        System.out.println(leetCode746.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        minCost[0] = 0;
        minCost[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            minCost[i] = Math.min(cost[i - 1] + minCost[i - 1], cost[i - 2] + minCost[i - 2]);
        }
        return minCost[minCost.length - 1];
    }
}
