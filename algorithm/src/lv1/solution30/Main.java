package lv1.solution30;

public class Main {
    public static void main(String[] args) {
        long x = 2; 
        int n = 5;
        Solution s = new Solution();
        long[] result = s.solution(x, n);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
