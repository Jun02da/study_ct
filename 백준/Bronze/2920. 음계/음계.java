import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] num = new int[8];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(input[i]); 
        }
        boolean isAscending = true;
        boolean isDescending = true;
     
        for (int i = 0; i < 7; i++) {
            if (num[i] > num[i + 1]) {
                isAscending = false;
            } else if (num[i] < num[i + 1]) {
                isDescending = false;
            }
        }
        
        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}