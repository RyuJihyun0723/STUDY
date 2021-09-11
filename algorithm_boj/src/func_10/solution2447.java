package func_10;

import java.util.Scanner;

public class solution2447 {
    static char[][] arr;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        arr = new char[N][N];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }

        pattern(0, 0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void pattern(int x, int y, int N){
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }else{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    pattern(x + (i * N/3), y + (j * N/3), N/3);
                }
            }
        }
    }
}
