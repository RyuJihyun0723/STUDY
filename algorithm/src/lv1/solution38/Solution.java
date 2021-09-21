package lv1.solution38;

class Solution {
    public long solution(long n) {
        String[] str = (Long.toString(n)).split("");
        
        for(int i=0;i<str.length-1;i++) {
            for(int j=0;j<str.length-1-i;j++){
                if(Integer.parseInt(str[j])<Integer.parseInt(str[j+1])) {
                    String tmp=str[j];    
                    str[j]=str[j+1];
                    str[j+1]=tmp;
                }    
            }
        }    
        String a = "";
        for(int i = 0; i < str.length; i++){
            a += str[i];
        }
        return Long.valueOf(a);
    }
}
