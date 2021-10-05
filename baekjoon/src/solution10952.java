import java.util.ArrayList;
import java.util.Scanner;

public class solution10952 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        while(true){
            int A = scan.nextInt();
            int B = scan.nextInt();
            if(A == 0 && B == 0){
                break;
            }else{
                arr.add(A+B);
            }
        }

        scan.close();

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
