import java.util.*;


class Num {
    static int count = 0;
    private int key, originalLocation, nextLocation;

    Num(int key){
        count ++;
        this.key = key;
        this.originalLocation = count;
    }
    void setNextLocation(int nextLocation){
        this.nextLocation = nextLocation;
    }

    public static class SortByKey implements Comparator<Num>{
        @Override
        public int compare(Num n1, Num n2){
            if(n1.key == n2.key){
                return n1.originalLocation - n2.originalLocation;
            }
            return n1.key - n2.key;
        }
    }
    public static class SortByOriginalLocation implements Comparator<Num>{
        @Override
        public int compare(Num n1, Num n2){
            return n1.originalLocation - n2.originalLocation;
        }
    }

    void printNextLocation(){
        System.out.print(this.nextLocation + " ");
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요. 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Num> arrNum = new ArrayList<>();
        for(int i = 0; i < n;  i++){
            int key =  scanner.nextInt();
            arrNum.add(new Num(key));
        }

        Collections.sort(arrNum, new Num.SortByKey());
        int i = 0;
        for(Num num : arrNum){
            i++;
            num.setNextLocation(i);
        }
        Collections.sort(arrNum, new Num.SortByOriginalLocation());
        for(Num num : arrNum){
            num.printNextLocation();
        }
    }
}