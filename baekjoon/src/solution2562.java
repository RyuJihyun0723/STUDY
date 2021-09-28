import java.util.HashMap;
import java.util.Scanner;

public class solution2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> hash = new HashMap<>();
        int max = 0;
        int key = 0;
        for(int i = 1; i <= 9; i++){
            int n = scan.nextInt();
            hash.put(i, n);
            if(n > max){
                max = n;
                key = i;
            }
        }
        scan.close();
        System.out.println(max);
        System.out.println(key);
    }
}
