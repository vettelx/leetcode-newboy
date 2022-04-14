package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode119
 * <p>
 * Pascal's Triangle II
 *
 * @author qiang.xu
 * @since 2022/3/28
 */
public class LeetCode119 {

    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            dp[i][0] = dp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            result.add(dp[rowIndex][i]);
        }
        return result;
    }

}
