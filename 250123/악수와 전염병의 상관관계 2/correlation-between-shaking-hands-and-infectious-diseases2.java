import java.util.*;

class Human {
    boolean infected = false;
    int count = 0;
}

class Infection implements Comparable<Infection> {
    int time;
    int x;
    int y;

    Infection(int time, int x, int y){
        this.time = time;
        this.x  = x;
        this.y = y;
    }
    public int compareTo(Infection e){
        return this.time - e.time;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n, k, p, t;
        n = scanner.nextInt();
        k = scanner.nextInt();
        p = scanner.nextInt();
        t = scanner.nextInt();
        List<Human> humans = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            humans.add(new Human());
        }
        Human firstHuman = new Human();
        firstHuman.infected = true;
        firstHuman.count = k;
        humans.set(p-1, firstHuman);
        
        List<Infection> infections = new ArrayList<>(t);
        for(int i = 0; i < t; i++) {
            int time, x, y;
            time = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
            Infection infection = new Infection(time, x, y);
            infections.add(infection);
        }
        Collections.sort(infections);
        
        Iterator<Infection> iterator = infections.iterator();
        // while(iterator.hasNext()){
        //     Infection infection = iterator.next();
        //     System.out.print(infection.time);
        //     System.out.print(infection.x);
        //     System.out.print(infection.y);
        //     System.out.println();
        // }
        iterator = infections.iterator();

        while(iterator.hasNext()) {
            Infection infection = iterator.next();
            Human hx = humans.get(infection.x - 1);
            Human hy = humans.get(infection.y - 1);
            if(hx.count > 0 || hy.count > 0){
                if(hx.count > 0){
                    --hx.count;
                    if(hy.infected == false){
                        hy.infected = true;
                        hy.count = k;
                    }
                }
                if(hy.count > 0){
                    --hy.count;
                    if(hx.infected == false){
                        hx.infected = true;
                        hx.count = k;
                    }
                }
            }
            humans.set(infection.x -1, hx);
            humans.set(infection.y -1, hy);
        }

        Iterator<Human> iteratorHuman = humans.iterator();
        while(iteratorHuman.hasNext()){
            Human human = iteratorHuman.next();
            if(human.infected == true){
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}