import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] input = new int[n];
        int maxScore = 0;
        double sum = 0;
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
            if (input[i] > maxScore) {
                maxScore = input[i];
            }
        }
        for (int i = 0; i < n; i++) {
            sum += (double) input[i] / maxScore * 100;
        }
        double average = sum / n;
        System.out.println(average);
    }
}