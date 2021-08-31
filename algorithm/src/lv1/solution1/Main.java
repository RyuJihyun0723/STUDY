package lv1.solution1;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution s = new Solution();

        String result = s.solution(participant, completion);
        System.out.println(result);
    }
}
