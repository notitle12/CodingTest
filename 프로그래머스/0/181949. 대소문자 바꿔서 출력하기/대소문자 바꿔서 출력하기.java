import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // 입력 문자열 받기
        StringBuilder sb = new StringBuilder();  // 문자열 누적용

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);  // 숫자, 특수문자 등은 그대로 유지
            }
        }

        String answer = sb.toString();  // 최종 변환 문자열
        System.out.println(answer);     // 결과 출력
    }
}