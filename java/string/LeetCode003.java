package string;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode003
 * <p>
 * Longest Substring Without Repeating Characters
 *
 * @author qiang.xu
 * @since 2022/3/29
 */
public class LeetCode003 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }


}
