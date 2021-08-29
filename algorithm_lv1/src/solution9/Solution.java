package solution9;

class Solution {
	boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        
        String[] arr; 
        
        arr = s.split(""); 
        int a = 0;
        int b = 0;
        
        for(int i=0;i<arr.length;i++) { 
        	if(arr[i].equals("P")) {
        		a++;
        	}else if(arr[i].equals("Y")) {
        		b++;
        	}
        }
        if(a == b) {
        	answer = true;
        }else {
        	answer = false;
        }

        return answer;
    }
}
