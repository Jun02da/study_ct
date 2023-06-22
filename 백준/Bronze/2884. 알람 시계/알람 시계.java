import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int H = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        
        int resultM = M-45;
        if(resultM<0) {
        	H -= 1;
        	if(H<0) {
        		H = 23;
        	}
        	resultM += 60;
        }
        System.out.println(H+" "+resultM);
    }
}