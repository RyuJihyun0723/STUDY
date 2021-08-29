package solution7;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        Solution solution = new Solution();

        int[] result = solution.solution(arr, divisor);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
