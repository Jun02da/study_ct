import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int[][] arr = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        make_APT();

        for (int i = 0; i < num; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]).append("\n");
        }
        System.out.println(sb);
    }

    public static void make_APT() {
        for (int i = 0; i < 15; i++) {
            arr[i][1] = 1;
            arr[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
    }
}