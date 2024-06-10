import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int maxAllowed = nums.length / 2;
        Set<Integer> uniqueNums = new HashSet<Integer>();
        
        for (int num : nums) {
            if (uniqueNums.size() >= maxAllowed) {
                break;
            }
            uniqueNums.add(num);
        }
        
        return uniqueNums.size();
    }
}