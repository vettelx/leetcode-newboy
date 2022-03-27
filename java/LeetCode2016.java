/**
 * LeetCode2016
 * <p>
 * Maximum Difference Between Increasing Elements
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode2016 {

    public int maximumDifference(int[] nums) {
        int minSofar = nums[0];
        int max = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minSofar) {
                max = Math.max(nums[i] - minSofar, max);
            } else {
                minSofar = nums[i];
            }
        }
        return max;
    }
}
