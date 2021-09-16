package lv2.solution10;

public class Main {
    public static void main(String[] args) {
        String s = "110010101001";

        Solution sol = new Solution();
        int[] result = sol.solution(s);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
