package lv1.solution23;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Solution s = new Solution();
        int[] result = s.solution(arr);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
