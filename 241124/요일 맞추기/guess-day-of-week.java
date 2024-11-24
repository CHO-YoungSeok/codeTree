import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner =  new Scanner(System.in);
        int m1, d1, m2, d2;
        m1 = scanner.nextInt();
        d1 = scanner.nextInt();
        m2 = scanner.nextInt();
        d2 = scanner.nextInt();

        int [] monthes = {31, 28, 31, 30, 31, 30 , 31, 31, 30, 31, 30, 31};
        int mGap = m2-m1;
        int dGap = d2-d1;
        int totalDays = 0;
        if(mGap > 0){
            for(int i = m1;  i < m2; i++){
                totalDays += monthes[i-1];
            }
        }
        else{
            for(int i = m2; i < m1; i++){
                totalDays -= monthes[i-1];
            }
        }
    
        totalDays += dGap;
        
        int day_of_weekNum = totalDays % 7;
        switch(day_of_weekNum){
            case 0:
                System.out.println("Mon");
                break;
            case 1:
                System.out.println("Tue");
                break;
            case 2:
                System.out.println("Wed");
                break;
            case 3:
                System.out.println("Thu");
                break;
            case 4:
                System.out.println("Fri");
                break;
            case 5:
                System.out.println("Sat");
                break;
            case 6:
                System.out.println("Sun");
                break;
            case -1:
                System.out.println("Sun");
                break;
            case -2:
                System.out.println("Sat");
                break;
            case -3:
                System.out.println("Fri");
                break;
            case -4:
                System.out.println("Thu");
                break;
            case -5:
                System.out.println("Wed");
                break;
            case -6:
                System.out.println("Tue");
                break;
        }


    }
}