import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (char c : str.toCharArray()) {
            System.out.println(c);  // 한 글자씩 줄바꿈 출력
        }
    }
}