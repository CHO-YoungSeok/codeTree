import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int locationA = 0, locationB = 0, preLocationA = 0, preLocationB = 0;
        int answer = 0;
        int phageA = 0, phageB = 0;
        List<Character> dirA = new ArrayList<>();
        List<Character> dirB = new ArrayList<>();
        List<Integer> timeA = new ArrayList<>();
        List<Integer> timeB = new ArrayList<>();
        for(int i = 0; i < n ;i++) {
            timeA.add(scanner.nextInt());
            dirA.add(scanner.next().charAt(0));
        }
        for(int i = 0; i < m; i++) {
            timeB.add(scanner.nextInt());
            dirB.add(scanner.next().charAt(0));
        }
        
        while(phageA < n || phageB < m){
            if(phageA < n) {
                if(dirA.get(phageA) == 'R')
                    locationA += timeA.get(phageA);
                else locationA -= timeA.get(phageA);
                phageA++;
            }
            if(phageB < m){
                if(dirB.get(phageB) == 'R') 
                    locationB += timeB.get(phageB);
                else 
                    locationB -= timeB.get(phageB);
                phageB++;
            }
            if(locationA == locationB) {
                if (preLocationA != preLocationB)  
                    answer++;       
            }
            if(locationA < locationB) {
                if(preLocationA > preLocationB)
                    answer++;
            }
            if(locationA > locationB) {
                if(preLocationA < preLocationB)
                    answer++;
            }
            preLocationA = locationA;
            preLocationB = locationB;
            // System.out.print(locationA);
            // System.out.print(" ");
            // System.out.println(locationB);
        }
        System.out.println(answer);
    }
}