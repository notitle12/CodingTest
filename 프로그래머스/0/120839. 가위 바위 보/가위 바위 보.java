class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        // rsp 문자열의 각 문자를 순차적으로 확인하여 대응되는 값을 추가
        for (char ch : rsp.toCharArray()) {
            if (ch == '2') {
                answer.append('0');  // 가위(2)는 바위(0)로 이김
            } else if (ch == '0') {
                answer.append('5');  // 바위(0)는 보(5)로 이김
            } else if (ch == '5') {
                answer.append('2');  // 보(5)는 가위(2)로 이김
            }
        }

        return answer.toString();
    }
}