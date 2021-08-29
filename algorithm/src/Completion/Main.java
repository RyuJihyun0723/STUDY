package algorithm.src.Completion;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution c = new Solution();

        String result = c.solution(participant, completion);

        System.out.println(result);
    }
}
