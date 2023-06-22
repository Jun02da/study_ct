import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] num = new int[t];
        String[] input = br.readLine().split(" ");
        for(int i=0; i < t; i++) {
        	num[i] = Integer.parseInt(input[i]);
        }
        int min = Arrays.stream(num).min().getAsInt();
        int max = Arrays.stream(num).max().getAsInt();
        
        System.out.println(min+" "+max);
    }
}