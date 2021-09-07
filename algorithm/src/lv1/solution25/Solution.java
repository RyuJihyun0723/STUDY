package lv1.solution25;

class Solution {
	public int solution(long num) {
        int answer = 0;
        long cnt = 0;
        while(num != 1) {
        	if(num % 2 == 0) {
        		num = num / 2; 
        		cnt++;
        	}else {
        		num = (num * 3) + 1;
        		cnt++;
        	}
        }
        if(cnt >= 500) {
        	answer = -1;
        }else{
            answer = (int)cnt;
        }
        return answer;
    }
}
