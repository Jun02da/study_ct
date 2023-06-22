import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] num = new int[t];
        String[] input = br.readLine().split("");
        int sum = 0;
        for(int i=0; i < t; i++) {
        	num[i] = Integer.parseInt(input[i]);
        	sum += num[i];
        }
        System.out.println(sum);
    }
}