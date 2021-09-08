package lv1.solution34;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        
        int[][] spz = {
                        {1, 2, 3, 4, 5},
                        {2, 1, 2, 3, 2, 4, 2, 5},
                        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
                    };
        
        int[] score = {0, 0, 0};
        ArrayList<Integer> maxList = new ArrayList<Integer>();
        
        for(int i = 0; i < answers.length; i++){
            if(spz[0][i % 5] == answers[i]){
                score[0]++;
            }
            if(spz[1][i % 8] == answers[i]){
                score[1]++;
            }
            if(spz[2][i % 10] == answers[i]){
                score[2]++;
            }
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        for(int i = 0; i < score.length; i++){
            if(score[i] == max){
                maxList.add(i + 1);
            }
        }
        answer = new int[maxList.size()];
        for(int i = 0; i < maxList.size(); i++){
            answer[i] = maxList.get(i);
        }
        
        return answer;
    }
}