import java.io.IOException;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr=new int[26];
		int c = System.in.read();
		while(c > 64) {
			if(c < 91) {
				arr[c-65]++;
			} else {
				arr[c-97]++;
			}
			c = System.in.read();
		}
		
		int maxCount = -1;
		int maxChar = -2;
		
		for(int i = 0;i < 26; i++) {
			if(arr[i]>maxCount) {
				maxCount = arr[i];
				maxChar = i;
			} else if(arr[i]==maxCount) {
				maxChar = -2;
			}
		}
		System.out.println((char)(maxChar+65));
	}
}