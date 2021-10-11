import java.util.Scanner;
public class solution15829 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        String str = scan.next();
        scan.close();
        int mod = 1234567891;
        long pow = 1;
        long sum = 0;
        for(int i = 0; i < L; i++){
            sum += (((int)str.charAt(i)-96) * pow);
            pow = (pow *= 31) % mod;
        }
        System.out.println(sum % mod);
    }
}