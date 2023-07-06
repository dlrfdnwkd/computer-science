import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        
        Arrays.sort(citations);
        int max = citations[length - 1];
        for(;max > 0;max--) {
            int i = 0;
            for(;i < length;i++) {
                if(max <= citations[i]) {
                    break;
                }
            }
            if(length - i >= max) {
                answer = max;
                break;
            }
        }
        
        return answer;
    }
}