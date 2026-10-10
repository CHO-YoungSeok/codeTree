import java.util.*;

public class Main {
    static int n, m;
    static int[] points;

    static int lowerBound(int target) {
        int low = 0, high = n - 1, mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (points[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    static int upperBound(int target) {
        int low = 0, high = n - 1, mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (points[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        Arrays.sort(points);

        int a, b;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(upperBound(b) - lowerBound(a));
        }
        
        // Please write your code here.
    }
}