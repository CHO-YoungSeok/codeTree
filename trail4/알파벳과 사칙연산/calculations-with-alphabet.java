import java.util.Scanner;
public class Main {
    static int opsSize, charsSize, pickedSize;
    static char[] ops;
    static char[] chars;
    static int[] picked = new int['f' - 'a' + 1];
    static int head = 0, max = Integer.MIN_VALUE;

    static void dfs(int curr) {
        if (curr == pickedSize) {
            char c = chars[0];
            int result = picked[c - 'a'];
            for (int i = 1; i < charsSize; i++) {
                c = chars[i];
                switch (ops[i-1]) {
                    case '*': result *= picked[c - 'a']; break;
                    case '/': result /= picked[c - 'a']; break;
                    case '+': result += picked[c - 'a']; break;
                    case '-': result -= picked[c - 'a']; break;
                }
            }
            max = Math.max(max, result);
            return;
        }

        for (int i = 1; i <= 4; i++) {
            picked[head++] = i;
            dfs(curr + 1);
            head--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        // Please write your code here.
        int n = expression.length();
        chars = new char[n/2+1];
        ops = new char[n/2];
        opsSize = ops.length;
        charsSize = chars.length;
        pickedSize = picked.length;

        chars[0] = expression.charAt(0);
        for (int i = 1; i < n - 1; i += 2) {
            ops[i/2] = expression.charAt(i);
            chars[(i+1)/2] = expression.charAt(i+1);
        }
    
        dfs(0);
        System.out.println(max);
    }
}