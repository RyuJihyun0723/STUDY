import java.util.PriorityQueue;
import java.util.Scanner;

public class solution10989 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PriorityQueue<Integer> arr = new PriorityQueue<>();

        for(int i = 0; i < N; i ++){
            arr.add(scan.nextInt());
        }
        scan.close();
        for(int i = 0; i < N; i++){
            System.out.println(arr.poll());
        }
    }
}
