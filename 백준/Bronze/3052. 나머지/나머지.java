import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        int[] result = new int[42];
        int count = 0;
        for(int i=0;i<num.length;i++) {
        	num[i] = Integer.parseInt(br.readLine());
        	int digit = num[i]%42;
        	result[digit]++;
        }
        for(int i=0;i<result.length;i++) {
        	if(result[i]>0) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}