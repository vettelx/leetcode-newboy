package dp;

/**
 * LeetCode392
 * <p>
 * Is Subsequence
 *
 * @author qiang.xu
 * @since 2022/3/28
 */
public class LeetCode392 {
    public static void main(String[] args) {
        LeetCode392 leetCode392 = new LeetCode392();
        System.out.println(leetCode392.isSubsequence("abc","acbce"));
    }

    public boolean isSubsequence(String s, String t) {
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < s.length() && ptr2< t.length()){
            if (s.charAt(ptr1) == t.charAt(ptr2)){
                ptr1++;
            }
            ptr2++;
        }
        return ptr1 == s.length();
    }

}
