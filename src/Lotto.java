import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lottoNumbers = generateLottoNumbers();
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }

    public static int[] generateLottoNumbers() {
        int[] lottoNumbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(45) + 1;

            // 중복된 번호를 방지하기 위해 이미 추첨된 번호인지 확인합니다.
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (randomNumber == lottoNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                i--; // 중복된 번호가 있으면 다시 번호를 추첨합니다.
            } else {
                lottoNumbers[i] = randomNumber;
            }
        }

        Arrays.sort(lottoNumbers); // 번호를 오름차순으로 정렬합니다.
        return lottoNumbers;
    }
}
