import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int sum = 0;

        for(int i =0;i<L;i++){
            sum += (arr[i] - 'a' + 1)* (int) Math.pow(31, i);
        }
        int hash = sum % M;
        System.out.println(hash);
    }
}