import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Person> people = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int weight = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);
            people.add(new Person(weight, height));
        }

        // 덩치 등수 계산
        for (int i = 0; i < N; i++) {
            int rank = 1; // 초기 등수는 1로 설정
            Person current = people.get(i);

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue; // 같은 사람은 비교하지 않음
                }

                Person other = people.get(j);

                if (current.weight < other.weight && current.height < other.height) {
                    rank++; // 더 큰 덩치의 사람이면 등수 증가
                }
            }

            System.out.print(rank + " ");
        }
    }
}

class Person {
    int weight;
    int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}