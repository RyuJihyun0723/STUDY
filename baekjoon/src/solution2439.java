import java.util.Scanner;

public class solution2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for(int i = 1; i <= N; i++){
            for(int j = N; j >= 1; j--){
                if(j > i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}