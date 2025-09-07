import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] arr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[i] = top[i];
        }

        for (int i = 0; i < n; i++) {
            arr[n + i] = bottom[i];
        }

        for (int p = 0; p < t; p++) {
            int temp = arr[2 * n - 1];
            for (int i = 2 * n - 1; 0 < i; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i + n] + " ");
        } 
    }
}