import java.util.Scanner;

public class solution1920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++){
            arr1[i] = scan.nextInt();
        }
        int M = scan.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0; i < M; i++){
            arr2[i] = scan.nextInt();
        }

        scan.close();
        int result = 0;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(arr2[i] == arr1[j]){
                    result = 1;
                    break;
                }
            }
            System.out.println(result);
            result = 0;
        }
    }
}
