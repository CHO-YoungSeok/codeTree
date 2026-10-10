import java.util.*;

public class Main {

    static long getCount(long m, long x) {
        long count = 0, mid = 0, low = 1, high = m;
        while (high >= low) {
            mid = low + (high - low) / 2;
            count++;
            if (mid > x) {
                high = mid - 1;
            } else if (mid < x) {
                low = mid + 1;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        // Please write your code here.

        long maxCount = 0, minCount = Long.MAX_VALUE;

        for (long x = a; x <= b; x++) {
            long count = getCount(m, x);
            minCount = Math.min(minCount, count);
            maxCount = Math.max(maxCount, count);
            // System.out.println(minCount + " " + maxCount);
        }

        System.out.println(minCount + " " + maxCount);
    }
}