import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int result:arr){
            sb.append(result+"\n");
        }
        System.out.println(sb);
    }
}