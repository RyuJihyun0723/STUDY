package algorithm.src.year2016;

class Solution {
    String[] weeks = { "FRI","SAT","SUN","MON","TUE","WED","THU"};
	int[] month = { 31,29,31,30,31,30,31,31,30,31,30,31 };
	
	public String solution(int a, int b) {
        String answer = "";
        	
        int day = 0;
        	
        for (int k = 0; k <(a-1); k++) {
        		day += month[k];
        }
        day += (b-1);
        day %= 7;
        answer = weeks[day];

        return answer;
    }
}
