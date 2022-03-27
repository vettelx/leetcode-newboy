/**
 * LeetCode169 Majority Element
 *
 * @author qiang.xu
 * @since 2022/3/25
 */
public class LeetCode169 {
    public static void main(String[] args) {

    }

    /**
     * PK法
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        int majority = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }

}
