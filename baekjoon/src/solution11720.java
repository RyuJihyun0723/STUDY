import java.util.Scanner;

public class solution11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String num = scan.next();
        scan.close();
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            sum += Integer.parseInt(num.substring(i, i+1));
        }
        System.out.println(sum);
    }
}
