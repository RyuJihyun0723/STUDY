import java.util.Scanner;

public class solution10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();

        for(int i = 0; i < N; i++){
            int n = scan.nextInt();
            if(n < X){
                System.out.println(n);
            }
        }
        scan.close();

    }
}
