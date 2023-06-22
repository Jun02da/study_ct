import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];

        for(int i=0;i<num.length;i++) {
        	num[i] = Integer.parseInt(br.readLine()); 
        }
        
        int result = num[0] * num[1] * num[2];
        
        String resultString = String.valueOf(result);
        int[] frequency = new int[10];
        
        for(int i=0;i<resultString.length();i++) {
        	int digit = Character.getNumericValue(resultString.charAt(i));
        	frequency[digit]++;
        }
        
        for(int i=0;i<frequency.length;i++) {
        	System.out.println(frequency[i]);
        }
	}
}