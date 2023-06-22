import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            String quiz = br.readLine(); // 퀴즈 결과 문자열
            int score = 0; // 점수 초기화
            int consecutive = 0; // 연속된 O의 개수 초기화

            for (int j = 0; j < quiz.length(); j++) {
                if (quiz.charAt(j) == 'O') {
                    consecutive++; // O가 연속되는 경우 연속된 개수 증가
                    score += consecutive; // 점수에 현재 연속된 개수를 더함
                } else {
                    consecutive = 0; // X를 만나면 연속된 개수 초기화
                }
            }

            System.out.println(score);
        }
    }
}