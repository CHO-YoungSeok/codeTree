import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        // Please write your code here.

        long left  = 1, right = Math.min(s, 2_000_000_000L);

        long answer = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;

            long sum = (1 + mid) * mid / 2;
            // System.out.println("mid = " + mid + ", sum = " + sum);
            if (sum > s) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        answer = left - 1;

        System.out.println(answer);
    }
}