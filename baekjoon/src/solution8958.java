import java.util.Scanner;

public class solution8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] str = new String[N];

        for(int i = 0; i < N; i++){
            int sum = 0;
            int cnt = 0;
            str[i] = scan.next();
            for(int j = 0; j < str[i].length(); j++){
                if((str[i].charAt(j))=='O'){
                    cnt++;
                    sum += cnt;
                }else if((str[i].charAt(j))=='X'){
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
        scan.close();
    }
}
