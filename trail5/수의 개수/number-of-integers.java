import java.util.Scanner;
public class Main {
    static int n, m;
    static int[] arr;

    static int getLeftIdx(int target) {
        int low = 0, high = n-1, mid = 0, leftIdx = n;

        while (high >= low) {
            mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
                leftIdx = Math.min(leftIdx, mid);
            } else {
                low = mid + 1;
            }
        }
        return leftIdx;
    }

    static int getRightNextIdx(int target) {
        int low = 0, high = n-1, mid = 0, rightNextIdx = n;

        while (high >= low) {
            mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
                rightNextIdx = Math.min(rightNextIdx, mid);
            } else {
                low = mid + 1;
            }
        }
        return rightNextIdx;
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
            System.out.println(getRightNextIdx(x) - getLeftIdx(x));
        }
    }
}