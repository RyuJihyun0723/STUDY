package lv1.solution32;

import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                arr.add(numbers[i] + numbers[j]);
            }
        }
        HashSet<Integer> arr2 = new HashSet<Integer>(arr);
        
        arr = new ArrayList<Integer>(arr2);
        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
