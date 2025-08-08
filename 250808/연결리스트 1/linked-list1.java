import java.util.Scanner;

class Node {
    String data;
    Node pre, next;

    Node(String data) {
        this.data = data;
        pre = next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sInit = sc.nextLine();
        int n = sc.nextInt();
        // Please write your code here.

        Node curr = new Node(sInit);

        for (int t = 0; t < n; t++) {
            int i = sc.nextInt();
            
            if (i == 1) {
                Node v = new Node(sc.next());
                v.next = curr;
                v.pre = curr.pre;
                curr.pre = v;
                if (v.pre != null) {
                    v.pre.next = v;
                }              
            } else if (i == 2) {
                Node v = new Node(sc.next());
                v.pre =  curr;
                v.next = curr.next;
                curr.next = v;
                if (v.next != null) {
                    v.next.pre = v;
                }               
            } else if (i == 3) {
                if (curr.pre != null) {
                    curr = curr.pre;
                }
            } else if (i == 4) {
                if (curr.next != null) {
                    curr = curr.next;
                }
            } else {}
            
            if (curr.pre != null) {
                System.out.print(curr.pre.data + " ");
            } else {
                System.out.print("(Null) ");
            }
            System.out.print(curr.data + " ");
            if (curr.next != null) {
                System.out.println(curr.next.data + " ");
            } else {
                System.out.println("(Null)");
            }
        }


    }
}