package dp;

/**
 * LeetCode005
 * <p>
 * Longest Palindromic Substring
 *
 * @author qiang.xu
 * @since 2022/3/26
 */
public class LeetCode005 {

    public static void main(String[] args) {
        LeetCode005 leetCode005 = new LeetCode005();
        System.out.println(leetCode005.longestPalindrome("aacabdkacaa"));
    }

    /**
     * dynamic programming
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int len = s.length();

        int begin = 0;
        int end = 0;
        int maxLength = 0;

        boolean[][] dp = new boolean[len][len];

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]));
                if (dp[i][j] && (j - i + 1 > maxLength)) {
                    begin = i;
                    end = j;
                    maxLength = j - i + 1;
                }
            }
        }
        return s.substring(begin, end + 1);

    }

    public String longestPalindrome1(String s) {
        int len = s.length();

        int maxLength = 1;
        int begin = 0, end = 0;

        for (int i = 0; i < len; i++) {
            int maxCur = 1;
            int curBegin = i, curEnd = i;
            for (int j = 1; j < len; j++) {
                if (i - j >= 0 && i + j < len && s.charAt(i - j) == s.charAt(i + j)) {
                    maxCur += 2;
                    curBegin = i - j;
                    curEnd = i + j;
                } else {
                    if (maxCur > maxLength) {
                        maxLength = maxCur;
                        begin = curBegin;
                        end = curEnd;
                    }
                }
            }
        }
        return s.substring(begin, end + 1);
    }
}
