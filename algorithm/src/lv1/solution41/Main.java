package lv1.solution41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        Solution sol = new Solution();

        System.out.println(sol.solution(s));
    }
}
