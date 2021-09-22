import java.util.Scanner;

public class solution10872 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.close();
        System.out.println(factorial(N));
    }

    public static int factorial(int N){
        if(N == 0){
            return 1;
        }else{
            return N * factorial(N-1);
        }
    }
}
