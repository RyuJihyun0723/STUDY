import java.util.Scanner;

public class solution2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = Integer.toString(scan.nextInt());
        String B = Integer.toString(scan.nextInt());
        String AA = "";
        String BB = "";
        scan.close();
        for(int i = A.length(); i > 0; i--){
            AA += A.substring(i-1, i);
            BB += B.substring(i-1, i);
        }
        int a = Integer.parseInt(AA);
        int b = Integer.parseInt(BB);
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }   
}
