import java.util.Scanner;

public class solution10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        scan.close();
        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(arr[c - 'a'] == -1){
                arr[c - 'a'] = i;
            }
            System.out.println(arr[c - 'a']);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
