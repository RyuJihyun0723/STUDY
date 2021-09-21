package lv1.solution39;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        for(int i = 0; i < num.length; i++){
            int cnt = 0;
            for(int j = 0; j < numbers.length; j++){
                if(numbers[j] == num[i]){
                    cnt++;
                }
            }
            if(cnt==0){
                answer += num[i];
            }
        }      
        return answer;
    }
}