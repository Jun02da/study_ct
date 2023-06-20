import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=a;i++) {
			for(int k=i;k<a;k++) {
				sb.append(" ");
			}
			for(int j=a-i;j<a;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}