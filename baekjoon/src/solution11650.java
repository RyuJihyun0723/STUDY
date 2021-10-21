import java.util.Arrays;
import java.util.Scanner;

public class solution11650 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(arr, (o1, o2) -> { 
            if(o1[0] == o2[0]){ 
                return Integer.compare(o1[1],o2[1]);
            } else{ 
                return Integer.compare(o1[0],o2[0]); 
            } 
        });
        for(int i = 0; i < N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}