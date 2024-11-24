import java.util.*;

class Num{
    private static int count = 0;
    private int value, oriLocation, nextLocation;

    Num(int value){
        count++;
        this.value = value;
        this.oriLocation = count;
    }
    void setNextLocation(int nextLocation){
        this.nextLocation = nextLocation;
    }
    
    public static class ComparatorByValue implements Comparator<Num>{
        @Override
        public int compare(Num n1, Num n2){
            if(n1.value == n2.value){
                return n1.oriLocation - n2.oriLocation;
            }
            return n1.value - n2.value;
        }
    }

    public static class ComparatorByOriLocation implements Comparator<Num>{
        @Override
        public int compare(Num n1, Num n2){
            return n1.oriLocation - n2.oriLocation;
        }
    }

    void printNextLocation(){
        System.out.print(nextLocation + " ");
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Num> ns = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int value = s.nextInt();
            ns.add(new Num(value));
        }

        Collections.sort(ns, new Num.ComparatorByValue());
        for(int i = 0; i < n;  i++){
            ns.get(i).setNextLocation(i+1);
        }

        Collections.sort(ns, new Num.ComparatorByOriLocation());
        for(int i = 0; i < n; i++){
            ns.get(i).printNextLocation();
        }


    }
}