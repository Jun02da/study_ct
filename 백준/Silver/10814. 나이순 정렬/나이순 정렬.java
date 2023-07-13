import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[201];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int age = Integer.parseInt(str[0]);
            String name = str[1];
            sb[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder fsb = new StringBuilder();
        for (StringBuilder result : sb) {
            fsb.append(result);
        }
        System.out.println(fsb);
    }
}