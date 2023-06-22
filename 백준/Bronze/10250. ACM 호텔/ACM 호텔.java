import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++) {
        	String[] str = br.readLine().split(" ");
        	int Y = Integer.parseInt(str[0]);
        	int X = Integer.parseInt(str[1]);
        	int N = Integer.parseInt(str[2]);
        	int count = 1;
      
        	while(N>Y) {
        		N = N-Y;
        		count++;
        	}
        	int result = (N*100)+count;
        	System.out.println(result);
        }
    }
}
