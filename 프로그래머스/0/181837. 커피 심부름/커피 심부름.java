class Solution {
    public int solution(String[] order) {
        int totalPrice = 0;

        for (String menu : order) {
            if (menu.contains("cafelatte")) {
                totalPrice += 5000;
            } else {
                totalPrice += 4500;
            }
        }

        return totalPrice;
    }
}