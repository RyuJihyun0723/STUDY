import java.util.Scanner;

public class solution9095 {
    public static void result(int n, int[]num, int sum, int cnt){
        if(sum == n){
            System.out.println(cnt);
        }else if(sum < n){
            result(n, num, sum, cnt);            
        }else{
            return;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = {1,2,3};
        int T = scan.nextInt();
        for(int i = 0; i < T; i++){
            int n = scan.nextInt();
            int sum = 0;
            int cnt = 0;
            result(n, num, sum, cnt);
        }
        scan.close();
    }
}
