import java.util.*;
public class Main {
    static int n, m;
    static int[] arr;

    static int lowerBound(int target) {
        int low = 0, high = n-1, mid = 0, minIdx = n;
        while (high >= low) {
            mid = low + (high - mid) / 2;

            if (arr[mid] >= target) {
                high = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                low = mid + 1;
            }
        }
        
        return minIdx;
    }

    static int upperBound(int target) {
        int low = 0, high = n -1, mid = 0, minIdx = n;
        while (high >= low) {
            mid = low + (high - mid) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                low = mid + 1;
            }
        }
        return minIdx;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            // Please write your code here.
            System.out.println(upperBound(x) - lowerBound(x))    ;


        }
    }
}