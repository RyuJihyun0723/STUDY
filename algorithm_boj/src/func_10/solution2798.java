package func_10;

import java.util.Scanner;

public class solution2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }

        int result = sum(arr, M);
        System.out.println(result);
    }
    public static int sum(int[] arr, int M){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j) continue;
                else{
                    for(int k = 0; k < arr.length; k++){
                        if(k == i || k == j) continue;
                        else{
                            int tmp = arr[i] + arr[j] + arr[k];
                            if(tmp == M){
                                return tmp;
                            }
                            if(sum < tmp && tmp < M){
                                sum = tmp;
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }  
}
