import java.util.Scanner;

public class solution2475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long sum = 0;
        for(int i = 0; i < 5; i++){
            int n = scan.nextInt();
            sum += n * n;
        }
        scan.close();
        System.out.println(sum%10);
    }
}
