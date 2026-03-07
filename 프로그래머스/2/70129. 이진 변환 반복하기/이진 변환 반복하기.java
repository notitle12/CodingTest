class Solution {
    public int[] solution(String s) {
        int countTransform = 0;
        int countZeros = 0;

        while (!s.equals("1")) {
            int originalLength = s.length();
            String removedZeros = s.replace("0", "");
            int newLength = removedZeros.length();

            countZeros += (originalLength - newLength);
            s = Integer.toBinaryString(newLength);
            countTransform++;
        }

        return new int[]{countTransform, countZeros};
    }
}