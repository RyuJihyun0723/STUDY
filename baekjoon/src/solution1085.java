import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class solution1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        PriorityQueue<Integer> arr = new PriorityQueue<>();

        arr.add(x);
        arr.add(w - x);
        arr.add(y);
        arr.add(h - y);

        System.out.println(arr.peek());

    }
}
