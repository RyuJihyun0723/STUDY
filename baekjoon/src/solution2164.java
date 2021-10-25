import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class solution2164 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        int cnt = 1;
        while(queue.size() != 1){
            if(cnt % 2 == 1){
                queue.remove();
            }else{
                queue.add(queue.poll());
            }
            cnt++;
        }
        System.out.println(queue.peek());
    }
}
