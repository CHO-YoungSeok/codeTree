import java.util.*;

public class Main {
    static int[] val = new int[6];   // a~f 각각에 대입할 값
    static char[] ops;
    static int[] nums;
    static int max = Integer.MIN_VALUE;

    static int calc() {
        int result = val[nums[0]];
        for (int i = 1; i < nums.length; i++) {
            int v = val[nums[i]];
            switch (ops[i - 1]) {
                case '*': result *= v; break;
                case '+': result += v; break;
                case '-': result -= v; break;
            }
        }
        return result;
    }

    static void dfs(int idx) {
        if (idx == 6) {
            max = Math.max(max, calc());
            return;
        }
        for (int i = 1; i <= 4; i++) {
            val[idx] = i;
            dfs(idx + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        int n = expression.length();

        ops = new char[n / 2];
        nums = new int[n / 2 + 1];

        for (int i = 1; i < n; i += 2) ops[i / 2] = expression.charAt(i);
        for (int i = 0; i < n; i += 2) nums[i / 2] = expression.charAt(i) - 'a';

        dfs(0);
        System.out.println(max);
    }
}