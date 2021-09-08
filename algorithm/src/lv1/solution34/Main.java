package lv1.solution34;

public class Main {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};

        Solution s = new Solution();
        int[] result = s.solution(answers);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);;
        }
    }
}
