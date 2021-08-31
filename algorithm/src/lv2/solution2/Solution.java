package lv2.solution2;

class Solution {
    public String solution(String s) {
        String answer = "";

        s = s.toLowerCase();
        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++){
            
            if ("".equals(arr[i])) {
                answer += arr[i];
            } else {
                answer += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            }
            
            if (i < arr.length - 1)
                answer += " ";
        }
        
        if (" ".equals(s.substring(s.length()-1))) 
            answer += " ";
        return answer;
    }
}
