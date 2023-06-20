import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
                maxIndex = i + 1;
            }
        }

        scanner.close();

        System.out.println(max);
        System.out.println(maxIndex);
	}
}