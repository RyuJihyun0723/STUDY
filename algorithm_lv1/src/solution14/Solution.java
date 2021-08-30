package solution14;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        
        String[] arr = s.split(" ", -1);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(" ")){
                arr[i] = "";
            }else{
                for(int j = 0; j < arr[i].length(); j++){
                    String[] arr2 = arr[i].split("");
                    if(j % 2 == 0){
                        arr2[j] = arr2[j].toUpperCase();
                    }
                    answer += arr2[j];
                }
                if(i == arr.length-1){
                    break;
                }else{
                    answer += " ";
                }
            }
        }
        return answer;
    }
}
