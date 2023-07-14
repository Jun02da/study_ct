import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 1; i < K; i++) {
                int front = queue.poll();
                queue.offer(front);
            }
            int num = queue.poll();
            sb.append(num);
            if(!queue.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}