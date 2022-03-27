package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode118
 * <p>
 * Pascal's Triangle
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode118 {

    public static void main(String[] args) {
        LeetCode118 leetCode118 = new LeetCode118();
        System.out.println(leetCode118.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] dp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            dp[i][0] = dp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
            List<Integer> resultOfRow = new ArrayList<>();
            for (int k = 0; k <= i; k++) {
                resultOfRow.add(dp[i][k]);
            }
            result.add(resultOfRow);
        }
        return result;
    }

}
