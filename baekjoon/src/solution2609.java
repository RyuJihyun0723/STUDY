import java.util.Scanner;

public class solution2609{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        scan.close();
        if(A > B){
            int gcd = gcd(A, B);
            System.out.println(gcd);
            System.out.println((A * B) / gcd);
        }else{
            int gcd = gcd(B, A);
            System.out.println(gcd);
            System.out.println((A * B) / gcd);
        }

    }

    public static int gcd(int A, int B){
        if(A % B == 0){
            return B;
        }
        return gcd(B, A % B);
    }
}