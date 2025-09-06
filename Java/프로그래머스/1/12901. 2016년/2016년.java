class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int num = 0;
        int day = 0;
        switch (a - 1) {
            case 0 -> num = num + 0;
            case 1 -> num = num + 31;
            case 2 -> num = num + 60; //29;
            case 3 -> num = num + 91; //31;
            case 4 -> num = num + 121; // 30;
            case 5 -> num = num + 152; // 31;
            case 6 -> num = num + 182; // 30;
            case 7 -> num = num + 213; // 31;
            case 8 -> num = num + 244; // 31;
            case 9 -> num = num + 274; // 30;
            case 10 -> num = num + 305; // 31;
            case 11 -> num = num + 335; // 30;
        }
        
        day = (num + b) % 7;
        
        switch (day) {
            case 0 -> answer = "THU";
            case 1 -> answer = "FRI";
            case 2 -> answer = "SAT";
            case 3 -> answer = "SUN";
            case 4 -> answer = "MON";
            case 5 -> answer = "TUE";
            case 6 -> answer = "WED";
        }
        
        return answer;
    }
}