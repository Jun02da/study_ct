import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        String[] str2 = br.readLine().split(" ");
        int[] num = new int[N];

        for (int i = 0; i < str2.length; i++) {
            num[i] = Integer.parseInt(str2[i]);
        }

        int minSum = search(num, N, M);
        System.out.println(minSum);
    }

    static int search(int[] num, int N, int M) {
        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = num[i] + num[j] + num[k];

                    if (M == temp) {
                        return temp;
                    }
                    if (temp < M && result < temp){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}