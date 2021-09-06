package lv1.solution2;

class Solution {
    public int[] solution(long n) {
        int[] answer;
        String s = Long.toString(n);
        answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            answer[i] = Integer.parseInt(s.substring(s.length()-i-1, s.length()-i));
        }
        
        return answer;
    }
}
