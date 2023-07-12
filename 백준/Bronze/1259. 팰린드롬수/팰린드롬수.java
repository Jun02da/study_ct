import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int num = Integer.parseInt(bf.readLine());
            if (num == 0) {
                break;
            }
            if(isPalindrome(num)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
    private static boolean isPalindrome(int num){
        int reverseNum = 0;
        int originalNum = num;
        while(num!=0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reverseNum;
    }
}