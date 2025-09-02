class Solution {
    public String solution(String s) {
StringBuilder result = new StringBuilder();
        String[] words = s.split(" ", -1);

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            StringBuilder transformed = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    transformed.append(Character.toUpperCase(c));
                } else {
                    transformed.append(Character.toLowerCase(c));
                }
            }

            result.append(transformed);
            if (w != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}