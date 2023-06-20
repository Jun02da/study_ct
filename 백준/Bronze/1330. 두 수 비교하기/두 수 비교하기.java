import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
				
		String result = (A>B) ? ">" : (A<B) ? "<" : "==";
		System.out.println(result);
	}
}