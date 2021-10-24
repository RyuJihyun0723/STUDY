import java.util.Arrays;
import java.util.Scanner;

public class solution2108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); 
        double []num = new double[N]; 
        for(int i=0; i<N; i++) num[i]=scan.nextDouble();
        scan.close(); 
        double sum=0; 
        for (double d : num) sum+=d; 

        System.out.println((int)Math.round(sum/N)); 
        
        Arrays.sort(num); 
        System.out.println((int)num[N/2]); 

        int []freq = new int[8001];
        for (double d : num) freq[(int)d+4000]++;

        int maxFrequency = 0; 
        int maxIndex = 0; 

        for (int i=0; i<8001; i++){
            if ( freq[i] > maxFrequency ) maxFrequency = freq[i]; 
        }
        
        boolean twice = false; 
        for (int i=0; i<8001; i++){ 
            if ( freq[i] == maxFrequency ) { 
                if (twice){ 
                    maxIndex = i-4000; 
                    break; 
                } 
                maxIndex = i-4000; 
                twice=true; 
            } 
        } 
        System.out.println(N==1 ? (int)num[0] : maxIndex); 
        System.out.println((int)(num[N-1] - num[0])); 
    } 
}