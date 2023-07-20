import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        while(num%5!=0){
            if(num == 4){
                count = -1;
                break;
            }
            num -= 3;
            count ++;
        }
        count += num/5;
        System.out.println(count);
    }
}
