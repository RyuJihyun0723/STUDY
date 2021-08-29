package solution4;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        Solution solution = new Solution();

        int[] result = solution.solution(arr);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}

