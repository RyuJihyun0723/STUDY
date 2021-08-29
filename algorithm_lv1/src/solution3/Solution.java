package solution3;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(""); 
        if(s.length()%2 == 0) {
        	answer = arr[(s.length()/2)-1]+arr[s.length()/2];
        }else {
        	answer = arr[s.length()/2];
        }
        
        return answer;
    }
}