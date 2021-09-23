import java.util.Scanner;

public class solution1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = Integer.toString(N);
        int cnt = 0;
        if(str.length()==1){
            str = "0"+"str";
        }
        plus(N, str, cnt);
    }
    public static void plus(int N, String str, int cnt){
        String one = str.substring(0, 1);
        String two = str.substring(1, 2);
        String sum = Integer.toString(Integer.parseInt(one) + Integer.parseInt(two));
        if(Integer.parseInt(two+sum) == N){
            System.out.println(cnt);
        }else{
            cnt++;
            plus(N, str, cnt);
        }
    }
}
