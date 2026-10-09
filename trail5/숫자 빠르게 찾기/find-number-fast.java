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

            while (high >= low) {
                mid = low + (high - low) / 2;
                if (arr[mid] < x) {
                    low = mid + 1;
                } else if (arr[mid] > x){
                    high = mid - 1;
                } else {
                    ans = mid + 1;
                    break;
                }
            }

            System.out.println(ans);
        }

    }
}