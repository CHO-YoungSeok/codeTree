import java.util.*;

public class Main {
    static int[][] a;
    static int n;
    static int m;

    static boolean isContinuity(int row, int upOrDown) { // upOrDown : -1 or 1 or 0
        int nextRow = row + upOrDown;
        
        if (
            0 <= nextRow
            && nextRow < n
        ) {
            for (int i = 0; i < m; i++) {
                if (a[row][i] == a[nextRow][i]) {
                    return true;
                }
            }
        }

        return false;
    }

    static void shift(int row, int upOrDown, char dir) {  //upOrDown ==  1 or -1 or 0
        if (dir == 'L') {
            int temp = a[row][m - 1];
            for (int i = m - 1; 0 < i; i--) {
                a[row][i] = a[row][i - 1];
            }
            a[row][0] = temp;

        } else if (dir == 'R'){
            int temp = a[row][0];
            for (int i = 0; i < m - 1; i++) {
                a[row][i] = a[row][i + 1];
            }
            a[row][m - 1] = temp;            
        } else {}

        if (upOrDown == 0) {
            if (isContinuity(row, 1)) {
                shift(row + 1, 1, (dir == 'L') ? 'R' : 'L');
            }

            if (isContinuity(row, -1)) {
                shift(row - 1, -1, (dir == 'L') ? 'R' : 'L');
            }
        }

        if (upOrDown == 1) {  // 아래로
            if (isContinuity(row, 1)) {
                shift(row + 1, 1, (dir == 'L') ? 'R' : 'L');
            }
        }

        if (upOrDown == -1) {  // 위로
            if (isContinuity(row, -1)) {
                shift(row - 1, -1, (dir == 'L') ? 'R' : 'L');
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int q = sc.nextInt();
        a = new int[n][m];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int r = sc.nextInt();
            char d = sc.next().charAt(0);
            shift(r - 1, 0, d);

            // Arrays.stream(a).forEach(arr -> {
            //     Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
            //     System.out.println();
            // });
            // System.out.println();
        }


        Arrays.stream(a).forEach(arr -> {
            Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
            System.out.println();
        });
    }
}