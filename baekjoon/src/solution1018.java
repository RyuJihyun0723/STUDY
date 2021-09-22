import java.util.Scanner;

public class solution1018{
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        arr = new boolean[N][M];
        scan.nextLine();

        for(int i = 0; i < N; i++){
            String s = scan.nextLine().trim();
            for(int j = 0; j < M; j++){
                if(s.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }
        scan.close();

        int row = N-7;
        int col = M-7;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                bnw(i, j);
            }
        }
        System.out.println(min);
    }

    public static void bnw(int x, int y){
        int rowEnd = x+8;
        int colEnd = y+8;
        int cnt = 0;

        boolean tf = arr[x][y];
        for(int i = x; i < rowEnd; i++){
            for(int j = y; j < colEnd; j++){
                if(arr[i][j] != tf){
                    cnt++;
                }
                tf = !tf;
            }
            tf = !tf;
        }
        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(min, cnt);
    }
}