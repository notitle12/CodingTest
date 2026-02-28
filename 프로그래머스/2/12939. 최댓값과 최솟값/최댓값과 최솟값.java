import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        
        int min = Arrays.stream(numbers)
                       .mapToInt(Integer::parseInt)
                       .min()
                       .getAsInt();
                       
        int max = Arrays.stream(numbers)
                       .mapToInt(Integer::parseInt)
                       .max()
                       .getAsInt();

        return min + " " + max;
    }
}