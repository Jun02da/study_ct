import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++) {
        	String[] str = br.readLine().split(" ");
        	int num = Integer.parseInt(str[0]);
        	String word = str[1];
        	StringBuilder sb = new StringBuilder();
        	for (int i = 0; i < word.length(); i++) {
                for (int k = 0; k < num; k++) {
                    sb.append(word.charAt(i));
                }
            }
        	System.out.println(sb);
        }
    }
}