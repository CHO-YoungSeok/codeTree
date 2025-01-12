import java.util.*;

class Tile {
    public int white;
    public int black;
    public int last;  // w=1, b=2
    
    public Tile() {
        this.white = 0;
        this.black = 0;
        this.last = -1;
    }
}

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Tile[] field = new Tile[200000];
        for(int i = 0; i < 200000; i++){
            field[i] = new Tile();
        }
        
        int head = 100000;
        
        int x = 0;
        char direction;
        for(int i = 0; i < n; i++){
            x = scanner.nextInt();
            direction = scanner.next().charAt(0);

            if(direction == 'R') {
                for(int  j = 0; j  < x; j++){
                    field[head].black++;
                    field[head].last = 2;
                    head++;
                }
                head--;
            } else {
                for(int j = 0; j < x; j++){
                    field[head].white++;
                    field[head].last = 1;
                    head--;
                }
                head++;
            }
        }
        int w =0, b = 0, s = 0;
        for(int i = 0; i < 200000; i++){
            if(field[i].white >= 2 && field[i].black >=2){
                s++;
            } else {
                int color = field[i].last;
                if(color == 1){
                    w++;
                } else if(color == 2) {
                    b++;
                }
            }
        }

        System.out.print(w);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.print(s);

    }
}