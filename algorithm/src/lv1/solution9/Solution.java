package lv1.solution9;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Vector v = new Vector<Integer>();
        v.add(arr[0]);

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i+1]){
                v.add(arr[i+1]);
            }
        }      

        answer = new int[v.size()];

        for(int i = 0; i < v.size(); i++){
            int n = (int)v.get(i);
            answer[i] = n;
        }
        return answer;
    }
}
