package lv1.solution3;

public class Main {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        Solution s = new Solution();

        int result = s.solution(absolutes, signs);

        System.out.println(result);
    }
}
