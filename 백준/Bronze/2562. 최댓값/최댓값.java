import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[9];

        int max = 0;
        int maxIndex = 0;

        for(int i=0;i<num.length;i++) {
        	num[i] = Integer.parseInt(br.readLine());
        	if(num[i]>max) {
        		max = num[i];
        		maxIndex = i+1;
        	}
        }
        
        System.out.println(max);
        System.out.println(maxIndex);
	}
}