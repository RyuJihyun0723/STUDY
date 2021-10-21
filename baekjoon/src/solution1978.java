import java.util.Scanner;

public class solution1978{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt2 = 0;
        for(int i = 0; i < N; i++){
            int M = scan.nextInt();
            int cnt = 0;
            for(int j = 1; j <= M; j++){
                if(M % j == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                cnt2++;
            }
        }
        System.out.println(cnt2);
        scan.close();
    }
}