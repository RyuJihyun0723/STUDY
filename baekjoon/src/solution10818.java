import java.util.Arrays;
import java.util.Scanner;

public class solution10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] num = new int[N];
        
        for(int i = 0; i < N; i++){
           num[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[N-1]);
    }
}
