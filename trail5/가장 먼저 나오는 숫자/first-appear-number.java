import java.util.*;
public class Main {

    static int n, m;
    static int[] arr;
    static int getMinIdx(int target) {
        int mid = 0, low = 0, high = n-1;
        while (high >= low) {
            mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (low < arr.length && arr[low] == target)
            return low + 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        // Please write your code here.
        for (int i = 0; i < m; i++) {
            System.out.println(getMinIdx(queries[i]));
        }

    }
}