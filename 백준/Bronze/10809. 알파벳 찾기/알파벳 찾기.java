import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        for(int i=0; i < str.length(); i++) {
        	char c = str.charAt(i);
        	int index = c - 'a';
        	if(arr[index]==-1) {
        		arr[index] = i;
        	}
        }
        for (int a : arr) {
        	System.out.print(a+" ");
		}
    }
}