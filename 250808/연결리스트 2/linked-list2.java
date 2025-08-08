import java.util.*;

class Node {
    Node pre, next = null;
    int id;
    Node
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        // Please write your code here.

        Node[] nodes = new Node[n + 1];
        for (int i = 1; i < n + 1; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < q; i++) {
            int dir = sc.nextInt();
            if (dir == 1) {
                Node curr = nodes[sc.nextInt()];
                if (curr.pre != null) 
                    curr.pre.next = curr.next;
                if (curr.next != null)
                    curr.next.pre = curr.pre;

                curr.pre = curr.next = null;
            } else if (dir == 2) {
                Node inode = nodes[sc.nextInt()];
                Node jnode = nodes[sc.nextInt()];

                jnode.next = inode;
                jnode.pre = inode.pre;
                inode.pre = jnode;
                if (jnode.pre != null) 
                    inode.pre.next = jnode;
                
            } else if (dir == 3) {
                Node inode = nodes[sc.nextInt()];
                Node jnode = nodes[sc.nextInt()];

                jnode.pre = inode;
                jnode.next = inode.next;
                inode.next = jnode;
                if (jnode.next != null) 
                    jnode.next.pre = jnode;
                
            } else if (dir == 4) {
                Node inode = nodes[sc.nextInt()];

                if (inode.pre != null) {
                    System.out.print(inode.pre.id + " ");
                } else {
                    System.out.print("0 ");
                }

                if (inode.next != null) {
                    System.out.println(inode.next.id);
                } else {
                    System.out.println(0);
                }
                
            } else {}
        }



    }
}