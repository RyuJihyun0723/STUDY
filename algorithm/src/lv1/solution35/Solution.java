package solution35;

class Solution {
    
    static int gcd(int a, int b){
	    if (a % b == 0) {
		    return b;
	    }
	    return gcd(b, a % b);
    }
    
    static int lcm(int a, int b){ 
        return a * b / gcd(a,b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
}
