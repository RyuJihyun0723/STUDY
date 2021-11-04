import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class solution10867{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < N; i++){
            hash.add(scan.nextInt());
        }
        scan.close();

        List arr = new ArrayList(hash);
        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i ++){
            System.out.println(arr.get(i));
        }
    }
}