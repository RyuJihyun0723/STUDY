package lv1.solution2;

public class Main {
    public static void main(String[] args) {
        long n = 12345;

        Solution s = new Solution();

        int[] result = s.solution(n);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
