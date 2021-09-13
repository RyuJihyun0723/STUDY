package solution35;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        
        Solution s = new Solution();

        int[] result = s.solution(n, m);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
