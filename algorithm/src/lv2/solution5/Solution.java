package lv2.solution5;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue();
        for(int i = 0; i < scoville.length; i++){
            heap.offer(scoville[i]);
        }
        while(heap.peek() <= K){
            if(heap.size() == 1){
                answer = -1;
                break;
            }
            int a = heap.poll();
            int b = heap.poll();
            
            heap.offer(a + (b * 2));
            
            answer++;
        }
        
        return answer;
    }
}