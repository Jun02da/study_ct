import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        // 단어 입력
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        // 중복 제거
        words = removeDuplicates(words);

        // 정렬
        Arrays.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });

        // 출력
        for (String word : words) {
            System.out.println(word);
        }
    }

    // 중복 제거 메소드
    private static String[] removeDuplicates(String[] words) {
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        return set.toArray(new String[set.size()]);
    }
}