package lv1.solution36;

class Solution {
	public long solution(long price, long money, long count) {
	        long answer = -1;
	        
	        for(long i = 0; i <= count; i++) {
	        	money -= (price*i);
	        }
        
	       if(money >= 0) {
	    	   answer = 0;
	       }else if(money < 0) {
	    	   answer = Math.abs(money);
	       }
	        
	        return answer;
	    }
}