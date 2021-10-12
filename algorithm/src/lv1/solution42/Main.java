package lv1.solution42;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        Solution s = new Solution();
        String[] result = s.solution(strings, n);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
