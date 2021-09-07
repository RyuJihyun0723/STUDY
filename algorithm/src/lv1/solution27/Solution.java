package lv1.solution27;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] s = Integer.toString(x).split("");
	        int y = 0;
	        for(int i = 0; i < s.length; i++) {
	        	y += Integer.parseInt(s[i]);
	        }
	        
	        if(x % y == 0) {
	        	answer = true;
	        }else {
	        	answer = false;
	        }
        
        return answer;
    }
}