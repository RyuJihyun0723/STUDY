package solution10;

class Solution {
    public boolean solution(String s) {
    boolean answer = true;
               int i = s.length();
               s = s.replaceAll("[a-zA-Z]", "");
               
              if(i == 4 || i == 6 ) {
                  if(s.length() < i){
                      answer = false;
                  }else if(s.length() == i){
                       answer = true;   
                  }
               }else {
                  answer = false;
              }
               return answer;
           }
       }
