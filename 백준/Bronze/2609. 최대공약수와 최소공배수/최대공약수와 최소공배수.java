import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        int gcd = gcd(num1,num2);
        int lcm = lcm(num1,num2);
        System.out.println(gcd);
        System.out.println(lcm);
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    private static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }
}