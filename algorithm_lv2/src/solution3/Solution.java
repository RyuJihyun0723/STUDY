package solution3;

class Solution {
    public int solution(int n) {
        int answer = 0;

        String binaryN = Integer.toBinaryString(n);
        String[] arrN = binaryN.split("");
        while(true){
            n++;
            int cntN = 0;
            int cntA = 0;
            String binaryA = Integer.toBinaryString(n);
            String[] arrA = binaryA.split("");
            for(int i = 0; i < binaryN.length(); i++){
                if(arrN[i].equals("1")){
                    cntN++;
                }
            }
            for(int i = 0; i < binaryA.length(); i++){
                if(arrN[i].equals("1")){
                    cntA++;
                }
            }
            if(cntN == cntA){
                answer = n;
                break;
            }
        }

        return answer;
    }
}
