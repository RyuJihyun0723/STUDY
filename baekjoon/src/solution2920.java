import java.util.Scanner;

public class solution2920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] N = new int[8];
        for(int i = 0; i < N.length; i++){
            N[i] = scan.nextInt();
        }
        scan.close();
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < N.length; i++){
            if(N[i] == i+1){
                cnt1++;
            }else if(N[i] == N.length - i){
                cnt2++;
            }
        }
        if(cnt1==8){
            System.out.println("ascending");
        }else if(cnt2==8){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
