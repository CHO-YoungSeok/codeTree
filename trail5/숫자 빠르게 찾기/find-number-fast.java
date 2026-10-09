import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            // Please write your code here.
            int low = 0, high = n -1, mid = 0;
            int ans = -1;
            int prevMid = - 1;

            while (high >= low && prevMid != mid) {
                prevMid = mid;
                mid = low + (high - low) / 2;
                // System.out.println(low  + " " + high  + " " + mid);
                if (x > arr[mid]) {
                    low = mid + 1;
                } else if (x < arr[mid]) {
                    high = mid;
                } else {
                    ans = mid+1;
                    break;
                }
            }
            System.out.println(ans);
        }

    }
}