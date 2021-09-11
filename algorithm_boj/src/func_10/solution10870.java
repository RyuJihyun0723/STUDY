package func_10;

import java.util.Scanner;

public class solution10870 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(fibonacc(n));
    }

    public static int fibonacc(int n){
        
        if(n == 0){
            return 0;
        }else if(n ==1){
            return 1;
        }else{
            return fibonacc(n-1) + fibonacc(n-2);
        }
    }
}
