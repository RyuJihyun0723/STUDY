import java.util.ArrayList;
import java.util.Scanner;

public class solution2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < t; i++){
            String r = scan.next();
            String s = scan.next();
            arr.add(r+s);
        }

        scan.close();
        for(int i = 0; i < arr.size(); i++){
            int r = Integer.parseInt((arr.get(i)).substring(0,1));
            for(int j = 1; j < arr.get(i).length(); j++){
                for(int k = 0; k < r; k++){
                    String s = arr.get(i).substring(j, j+1);
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }
}
