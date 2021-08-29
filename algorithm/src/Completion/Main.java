package algorithm.src.level1;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Completion c = new Completion();

        String result = c.solution(participant, completion);

        System.out.println(result);
    }
}
