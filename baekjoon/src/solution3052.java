import java.util.HashSet;
import java.util.Scanner;

public class solution3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> arr = new HashSet<>();
        for(int i = 0; i < 10; i++){
            arr.add((scan.nextInt())%42);
        }
        scan.close();
        System.out.println(arr.size());
    }
}
