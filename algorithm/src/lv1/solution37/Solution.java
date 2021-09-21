package lv1.solution37;

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        Stack<Integer> n3 = new Stack<>();
        
        while(n > 0){
            n3.push(n % 3);
            n /= 3;
            
        }
        int length = n3.size();
        for(int i = 0; i < length; i++){
            
            answer += (n3.peek()) * ((int)Math.pow(3,i));
            n3.pop();
        }
        return answer;
    }
}
