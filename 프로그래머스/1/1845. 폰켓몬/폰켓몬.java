import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxPick = nums.length / 2;
        HashSet<Integer> uniqueMons = new HashSet<>();

        for (int num : nums) {
            uniqueMons.add(num);
        }

        return Math.min(uniqueMons.size(), maxPick);
    }
}
