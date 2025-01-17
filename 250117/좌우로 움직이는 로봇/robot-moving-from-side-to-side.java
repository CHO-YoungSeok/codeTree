import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        List<Integer> timeA = new ArrayList<>();
        List<Character> dirA = new ArrayList<>();
        List<Integer> timeB = new ArrayList<>();
        List<Character> dirB = new ArrayList<>();

        int phageA = 0, phageB = 0;

        for(int i  = 0; i < n; i++){
            timeA.add(scanner.nextInt());
            dirA.add(scanner.next().charAt(0));
        }
        for(int i  = 0; i < m; i++){
            timeB.add(scanner.nextInt());
            dirB.add(scanner.next().charAt(0));
        }
        int locationA = 0, locationB = 0;
        int preLocationA = 0, preLocationB = 0;

        int answer = 0;
        while(timeA.get(n-1) > 0 || timeB.get(m-1) > 0) {
            if(timeA.get(n-1) > 0){
                if(timeA.get(phageA) == 0){
                    phageA++;
                }
                if(dirA.get(phageA) == 'R'){
                    ++locationA;
                } else {
                    --locationA;
                }
                timeA.set(phageA, timeA.get(phageA) - 1);
            }
            if(timeB.get(m-1) > 0) {
                if(timeB.get(phageB) == 0){
                    phageB++;
                }
                if(dirB.get(phageB) == 'R'){
                    locationB ++;
                } else {
                    locationB--;
                }
                timeB.set(phageB, timeB.get(phageB) - 1);
            }
            if(locationA == locationB){
                if(preLocationA != preLocationB){
                    answer++;
                }
            }
            preLocationA = locationA;
            preLocationB = locationB;
        }
        System.out.println(answer);
    }
}