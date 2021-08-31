package lv2.solution1;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            int x = Math.max(answer,arr[i]);
            int y = Math.min(answer,arr[i]);
            
            while(x % y != 0){
                int r = x % y;
                x = y;
                y = r;
            }
            answer = (answer * arr[i])/y;
        }
        
        return answer;
    }
}
