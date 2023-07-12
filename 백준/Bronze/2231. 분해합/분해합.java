import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int result = findSmallestConstructor(n);
        System.out.println(result);
    }
    private static int findSmallestConstructor(int n) {
        for (int i = 1; i < n; i++) {
            int sum = i;
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == n) {
                return i;
            }
        }

        return 0;
    }
}