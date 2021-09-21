package lv1.solution40;

import java.util.*;

class Solution {
    public int solution(String s) {
        
        HashMap<Integer, String> num = new HashMap<>();
        
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < number.length; i++){
            num.put(i, number[i]);
        }
        
        for(int i = 0; i < num.size(); i++){
            if(s.indexOf(num.get(i)) != -1){
                s = s.replace(num.get(i), Integer.toString(i));
            }
        }
        
        return Integer.parseInt(s);
    }
}
