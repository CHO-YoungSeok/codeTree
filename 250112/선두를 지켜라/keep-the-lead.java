import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] forA = new int[n][];
        int[][] forB = new int[m][];

        for(int i = 0; i < n; i++){
            forA[i] = new int[2];
        }
        for(int i = 0; i < m; i++){
            forB[i] = new int[2];
        }
        
        for(int i = 0; i < n; i++) {
            forA[i][0] = scanner.nextInt();
            forA[i][1] = scanner.nextInt();
        }    
        for(int i = 0; i < m; i++) {
            forB[i][0] = scanner.nextInt();
            forB[i][1] = scanner.nextInt();
        }    

        int lead = -1;
        int prelead = -1;
        int count = -1;
        int locationA = 0, locationB = 0;
        
        int pageA = 0, pageB = 0;
        while(forA[n-1][1] > 0) {
            if(forA[pageA][1] == 0) pageA++;
            if(forB[pageB][1] == 0) pageB++;

            locationA += forA[pageA][0];
            locationB += forB[pageB][0];
            if(locationA < locationB) lead = 2;
            else if(locationB < locationA) lead = 1;
            
            if(lead != prelead) count++;
            forA[pageA][1]--;
            forB[pageB][1]--;
            prelead = lead;
        }

        System.out.println(count);
    }
}