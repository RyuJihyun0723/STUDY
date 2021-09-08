package lv1.solution32;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        Solution s = new Solution();

        int[] result = s.solution(numbers);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
