package dp;

/**
 * LeetCode509
 * <p>
 * Fibonacci Number
 *
 * @author qiang.xu
 * @since 2022/3/27
 */
public class LeetCode509 {
    public static void main(String[] args) {

            System.out.println(fib(10));

    }

    public static int fib(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int tmp;
        for (int i = 2; i <= n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
