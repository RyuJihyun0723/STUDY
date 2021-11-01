import java.util.Scanner;

public class solution1312 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int N = scan.nextInt();

        scan.close();

        A %= B;
        for(int i = 0; i < N-1; i++){
            A *= 10;
            A %= B;
        }
        A *= 10;

        System.out.println(A/B);
    }
}
