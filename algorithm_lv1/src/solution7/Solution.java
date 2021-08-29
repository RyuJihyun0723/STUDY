package solution7;

import java.util.*;

class Solution {
    	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        Vector<Integer> v = new Vector<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		v.add(arr[i]);
        	}
        }
            if(v.size()==0){
                v.add(-1);
            }
        answer = new int[v.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = (int)v.get(i);
        }
        int tmp;
        for(int i = 0; i < answer.length-1; i++ ) {
            for (int j = i+1; j < answer.length; j++ ) {
                if(answer[j] < answer[i]) {
                    tmp = answer[j];
                    answer[j] = answer[i];
                    answer[i] = tmp;
                }
            }
        }
		return answer;
    }
}
