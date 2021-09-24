import java.util.Arrays;
import java.util.Scanner;

public class solution1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double sum = 0;
        double[] scores = new double[N];
        for(int i = 0; i < N; i++){
            scores[i] = scan.nextInt();
            sum += scores[i];
        }
        scan.close();
        Arrays.sort(scores);
        System.out.println(sum/scores[N-1]*100/N);
    }
}
