package lv1.solution33;

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int select = commands[i][2]-1;
            int[] cut = new int[end-start+1];
            for(int j = 0; j < cut.length; j++){
                cut[j] = array[start+j];
            }
            Arrays.sort(cut);
            answer[i] = cut[select];
        }
        return answer;
    }
}
