package lv2.solution2;

class Solution {
    public String solution(String s) {
        String answer = "";

        s = s.toLowerCase();
        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            
            if ("".equals(str)) {
                answer += str;
            } else {
                answer += str.substring(0, 1).toUpperCase() + str.substring(1);
            }
            
            if (i < arr.length - 1)
                answer += " ";
        }
        
        if (" ".equals(s.substring(s.length()-1))) 
            answer += " ";
        return answer;
    }
}
