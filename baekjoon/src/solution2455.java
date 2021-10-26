import java.util.Scanner;

public class solution2455 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int max = 0 - scan.nextInt() + scan.nextInt();
        int total = max;
        for(int i = 1; i < 4; i ++){
            total  = total - scan.nextInt() + scan.nextInt();
            if(total > max){
                max = total;
            }
        }
        scan.close();
        System.out.println(max);
    }
}
