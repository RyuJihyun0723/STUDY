package lv2.solution5;

public class Main {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        Solution s = new Solution();

        int result = s.solution(scoville, K);

        System.out.println(result);
    }
}
