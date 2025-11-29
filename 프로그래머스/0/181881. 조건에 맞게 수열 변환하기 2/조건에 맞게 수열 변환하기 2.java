import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] nextArr = new int[arr.length];
            boolean isChanged = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    nextArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    nextArr[i] = arr[i] * 2 + 1;
                } else {
                    nextArr[i] = arr[i];
                }

                if (arr[i] != nextArr[i]) {
                    isChanged = true;
                }
            }

            if (!isChanged) {
                return answer;
            }

            arr = nextArr;
            answer++;
        }
    }
}