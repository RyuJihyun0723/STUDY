package lv2.solution8;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr1 = s.split(" ");
        int[] arr2 = new int[arr1.length];
        
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0 ; j < arr2.length - i - 1 ; j++) {
                if(arr2[j] > arr2[j+1]) {
                    int temp = arr2[j+1];
                    arr2[j+1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        answer += arr2[0];
        answer += " ";
        answer += arr2[arr2.length-1];
        return answer;
    }
}
