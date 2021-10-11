import java.util.Scanner;

public class solution11050 {
    public static int fac(int N){
        int result = 1;
        for(int i = 1; i <= N; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        scan.close();
        System.out.println(fac(N)/(fac(N-K)*fac(K)));
    }
}
