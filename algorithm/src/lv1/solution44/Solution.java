package lv2.solution13;

class Solution {
    int answer = 0;

    public void prime(int sum){
        for(int i = 2; i < sum; i++){
            if(sum % i == 0){
                return; 
            }
        }
        answer += 1;
        return;
    }

    public int solution(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(i != j && j != k && i != k){
                        int sum = nums[i] + nums[j] + nums[k];
                        prime(sum);
                    }
                }
            }
        }

        return answer;
    }
}