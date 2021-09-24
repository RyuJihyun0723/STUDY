import java.util.Scanner;

public class solution2438 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for(int i = N; i >=1 ; i--){
            for(int j = i; j <= N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
