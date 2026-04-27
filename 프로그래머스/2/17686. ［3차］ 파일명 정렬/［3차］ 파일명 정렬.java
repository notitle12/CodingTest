import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] file1 = parse(s1);
                String[] file2 = parse(s2);
                
                int headCompare = file1[0].toLowerCase().compareTo(file2[0].toLowerCase());
                
                if (headCompare != 0) {
                    return headCompare;
                }
                
                return Integer.parseInt(file1[1]) - Integer.parseInt(file2[1]);
            }
            
            private String[] parse(String s) {
                String head = "";
                String number = "";
                String tail = "";
                
                int idx = 0;
                while (idx < s.length() && !Character.isDigit(s.charAt(idx))) {
                    head += s.charAt(idx);
                    idx++;
                }
                
                while (idx < s.length() && Character.isDigit(s.charAt(idx)) && number.length() < 5) {
                    number += s.charAt(idx);
                    idx++;
                }
                
                tail = s.substring(idx);
                
                return new String[]{head, number, tail};
            }
        });
        
        return files;
    }
}