import java.util.Scanner;

public class solution1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
		scan.close();
        
		int cnt = 0;
		int a = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (a == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}