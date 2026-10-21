import java.util.*;
public class Main {
    static int opsSize, charsSize, pickedSize;
    static char[] ops;
    static char[] chars;
    static int[] picked = new int['f' - 'a' + 1];
    static int head = 0, max = Integer.MIN_VALUE;
    static HashMap<Character, Integer> map = new HashMap<>();

    static void dfs(int curr) {
        if (curr == map.size()) {
            char c = chars[0];
            int result = picked[map.get(c)];
            for (int i = 1; i < charsSize; i++) {
                c = chars[i];
                switch (ops[i-1]) {
                    case '*': result *= picked[map.get(c)]; break;
                    case '/': result /= picked[map.get(c)]; break;
                    case '+': result += picked[map.get(c)]; break;
                    case '-': result -= picked[map.get(c)]; break;
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
        map.put(chars[0], map.size());
        for (int i = 1; i < n - 1; i += 2) {
            ops[i/2] = expression.charAt(i);
            chars[(i+1)/2] = expression.charAt(i+1);
            if (!map.containsKey(chars[(i+1)/2])) {
                map.put(chars[(i+1)/2], map.size());
            }
        }
    
        dfs(0);
        System.out.println(max);
    }
}