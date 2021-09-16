package lv2.solution10;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;
        
        while(!s.equals("1")){
            int oneCnt = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    oneCnt++;
                }else{
                    zeroCnt++;
                }
            }
            s = Integer.toBinaryString(oneCnt);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}
