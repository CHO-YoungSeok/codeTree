import java.util.*;

public class Main {
    static int n, m;
    static double minDis = Double.MAX_VALUE;
    static int[][] points;
    static List<int[]> picks = new ArrayList<>();

    static void choose(int currIdx, int size) {
        if (size == m) {
            double currMaxDis = 0;
            double dis = 0;
            for (int k = 0; k < m - 1; k++) {
                for (int l = k + 1; l < m; l++) {
                    dis = Math.pow(Math.abs(picks.get(k)[0] - picks.get(l)[0]), 2)
                            + Math.pow(Math.abs(picks.get(k)[1] - picks.get(l)[1]), 2);
                    currMaxDis = Math.max(currMaxDis, dis);
                }
            }
            minDis = Math.min(minDis, currMaxDis);
            return;
        }
        if (m - size > n - currIdx) {
            return;
        }

        picks.add(points[currIdx]);
        choose(currIdx+1, size +1);
        picks.remove(picks.size() - 1);

        choose(currIdx+1, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        // Please write your code here.
        choose(0, 0);
        System.out.print((long) minDis);        
    }
}