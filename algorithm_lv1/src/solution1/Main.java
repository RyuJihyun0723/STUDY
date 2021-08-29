package solution1;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution solution = new Solution();

        String result = solution.solution(participant, completion);

        System.out.println(result);
    }
}
