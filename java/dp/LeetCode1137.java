package dp;

/**
 * LeetCode1137
 * <p>
 * N-th Tribonacci Number
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode1137 {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = a + b + c;
            a = b;
            b = c;
            c = tmp;
        }
        return c;
    }
}
