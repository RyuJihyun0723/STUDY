import java.util.Scanner;

public class solution2839{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int min = N;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if((3*i) + (5*j) == N){
                    if(min > i + j){
                        min = i + j;
                    }
                }
            }
        }
        
        System.out.println(min);
    }
}