package lv1.solution23;

import java.util.Vector;
class Solution {
    public int[] solution(int[] arr) {
         int[] answer = {};
        
        Vector<Integer> v = new Vector<Integer>();
       
        for(int i = 0; i < arr.length; i++) {
        	v.add(arr[i]);
        }
        int min = v.get(0);
        for(int i = 1; i < v.size(); i++) {
        	if(v.get(i) <= min) {
        		min = v.get(i);
        	}
        }
        for(int i = 0; i < v.size(); i++) {
        	if(v.get(i).equals(min)) {
        		v.remove(i);
        	}
        }
          if(v.size() == 0 ) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[v.size()];
        	for(int i = 0; i < v.size(); i++) {
        		answer[i] = v.get(i);
        	}
        	
        }
                
        return answer;
    }
}
