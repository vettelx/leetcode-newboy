import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode001 two sum
 *
 * @author qiang.xu
 * @since 2022/3/22
 */
public class LeetCode001 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer j = hash.get(target - nums[i]);
            if (j != null && j != i) {
                return new int[]{i, j};
            }
            hash.put(nums[i], i);
        }
        return null;
    }

}
