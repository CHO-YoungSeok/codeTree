import java.util.*;

public class Main {
    static public class  Rectangle implements Comparable<Rectangle>{
        int sum;
        int row;
        int col;
        int spanRow;
        int spanCol;
        Rectangle(int sum, int row, int col, int spanRow, int spanCol){
            this.sum = sum;
            this.row = row;
            this.col = col;
            this.spanRow = spanRow;
            this.spanCol = spanCol;
        }
        
        @Override
        public int compareTo(Rectangle other){
            return this.sum - other.sum;
        }
        @Override
        public String toString(){
            return String.format("sum = %d, row = %d, col = %d, spanRow = %d, spanCol = %d", sum, row, col, spanRow, spanCol);
        }
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                grid[row][col] = sc.nextInt();
            }
        }
        List<Rectangle> list = new ArrayList<>();
               

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                for(int spanRow = 0; row+spanRow < n; spanRow++){
                    for(int spanCol = 0; col+spanCol < m; spanCol++){
                        int sum = 0;
                        for(int rowHead = row; rowHead <= row+spanRow; rowHead++){
                            for(int colHead = col; colHead <=col+spanCol; colHead++){
                                sum += grid[rowHead][colHead];
                            }
                        }
                        Rectangle temp = new Rectangle(sum, row, col, spanRow, spanCol);
                        list.add(temp);
                    }
                }
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));

        int lenList = list.size();
        int max = Integer.MIN_VALUE;
        for(int  i = 0;  i < lenList-1; i++){
            Rectangle aR = list.get(i);
            for(int j = i;  j < lenList; j++){
                Rectangle bR = list.get(j);
                Rectangle small, big;
                if(aR.row == bR.row){
                    if(aR.col < bR.col) {
                        small = aR;
                        big = bR;
                    } else {
                        small = bR;
                        big = aR;
                    }
                } else if(aR.row < bR.row) {
                    small = aR;
                    big = bR;
                } else {
                    small = bR;
                    big = aR;
                }
                if(big.row <= small.row + small.spanRow
                     && big.col <= small.col + small.spanCol){
                    continue;
                } else {
                    if(max < big.sum + small.sum){
                        max = big.sum + small.sum;
                    } else {
                        continue;
                    }
                }             

            }
        }
        System.out.println(max);


    }
}