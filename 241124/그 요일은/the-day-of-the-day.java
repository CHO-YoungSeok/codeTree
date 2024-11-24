import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int m1, d1, m2, d2;
        Scanner scanner = new Scanner(System.in);
        m1 = scanner.nextInt();
        d1 = scanner.nextInt();
        m2 = scanner.nextInt();
        d2 = scanner.nextInt();
        String dayOfWeek = scanner.next();
        int totalDays = 0;
        int [] monthes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // size 12
        for(int i = m1;  i < m2;  i++){
            totalDays += monthes[i-1];
        }
        totalDays += d2 - d1;
        int weeks = totalDays / 7; 
        int extra = totalDays % 7;
        // System.out.println("totalDays = " + totalDays);
        // System.out.println("weeks = " + weeks);
        // System.out.println("extra = " + extra);
        int []extraDOW = new int[7];
        
        for(int i = 0; i <= extra; i++){
            extraDOW[i] = 1;
        }
        if(dayOfWeek.equals("Mon"))
            System.out.println(weeks + extraDOW[0]);
        else if(dayOfWeek.equals("Tue"))
            System.out.println(weeks + extraDOW[1]);
        else if(dayOfWeek.equals("Wed"))
            System.out.println(weeks + extraDOW[2]);
        else if(dayOfWeek.equals("Thr"))
            System.out.println(weeks + extraDOW[3]);
        else if(dayOfWeek.equals("Fir"))
            System.out.println(weeks + extraDOW[4]);
        else if(dayOfWeek.equals("Sat"))
            System.out.println(weeks + extraDOW[5]);
        else
            System.out.println(weeks + extraDOW[6]) ;
        
        

        

        
    




        
        


    }
}