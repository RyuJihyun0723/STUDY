package func_10;

import java.io.*;
import java.util.*;

public class solution16198 {
    static List<Integer> w = new ArrayList<Integer>();
    static int power = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i< N; i++) {
			w.add(Integer.parseInt(st.nextToken()));
        }

		energy(N, w, 0);
		System.out.println(power);
    }

    public static void energy(int N, List<Integer> w, int sum){
        if(N == 2){
            power = Math.max(sum, power);
            return;
        }
		for(int i=1; i< w.size() -1; i++) { 
			int s = w.get(i-1) * w.get(i+1); 
			int temp = w.get(i); 
            w.remove(i); 
			energy(N-1, w, sum+s);
			w.add(i, temp); 
        }   
    }
}
