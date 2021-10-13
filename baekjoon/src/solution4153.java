import java.util.Arrays;
import java.util.Scanner;

public class solution4153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int[] arr = new int[3];
            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();
            arr[2] = scan.nextInt();
            Arrays.sort(arr);
            if(arr[0] == 0){
                break;
            }else if((arr[0]*arr[0]) + (arr[1]*arr[1]) == (arr[2]*arr[2])){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
        scan.close();
    }
}
