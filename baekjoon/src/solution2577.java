import java.util.HashMap;
import java.util.Scanner;

public class solution2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = 1;
        for(int i = 0; i < 3; i++){
            n *= scan.nextInt();
        }
        for(int i = 0; i <= 9; i++){
            hash.put(i, 0);
        }
        String s = Integer.toString(n);
        scan.close();
        for(int i = 0; i < s.length(); i++){
            int k = Integer.parseInt(s.substring(i, i+1));
            hash.put(k, hash.get(k)+1);
        }
        for(int i = 0 ; i < hash.size(); i++){
            System.out.println(hash.get(i));
        }
    }
}
