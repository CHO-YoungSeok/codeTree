import java.util.*;
public class Main {
    static Map<Character, Integer> map = new HashMap<>();
    static int mapHead = 0;
    static char[] chars;
    static char[] ops;
    static int[] per = new int['f' - 'a' + 1];
    static int head = 0, max = Integer.MIN_VALUE;

    static void dfs (int head) {
        if (head == mapHead) {
            int result = per[map.get(chars[0])];
            for (int i = 1; i < chars.length; i++) {
                switch (ops[i-1]) {
                    case '*': result *= per[map.get(chars[i])]; break;
                    case '/': result /= per[map.get(chars[i])]; break;
                    case '+': result += per[map.get(chars[i])]; break;
                    case '-': result -= per[map.get(chars[i])]; break;
                    default: System.out.println("ERR ");
                }
            }
            max = Math.max(max, result);
            return;
        }

        for (int i = 1; i <= 4; i++) {
            per[head++] = i;
            dfs(head);
            head--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        // Please write your code here.
        int n = expression.length();
        chars = new char[n/2 + 1];
        ops = new char[n/2];
        int j = 0;
        for (int i = 0; i < n; i += 2) {
            chars[j] = expression.charAt(i);
            if (!map.containsKey(chars[j])) {
                map.put(chars[j], mapHead++);
            }
            j++;
        }
        j = 0;
        for (int i = 1; i < n - 1; i += 2) {
            ops[j] = expression.charAt(i);
            j++;
        }

        dfs(0);
        System.out.println(max);
    }
}