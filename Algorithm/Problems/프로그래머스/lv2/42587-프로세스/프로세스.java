class Solution {
    public int solution(int[] priorities, int location) {
        int[] answer = new int[priorities.length];
        int[] ranks = new int[10];
        int length = priorities.length;
        
        for(int i = 0;i < length;i++) {
            ranks[priorities[i]]++;
        }
        int rank = 9;
        int index = 0;
        int order = 1;
        while(rank > 0) {
            int startIndex = index;
            while(index < length) {
                if(ranks[rank] == 0) break;
                if(priorities[index] == rank) {
                    ranks[rank]--;
                    answer[index] = order++;
                }
                index++;
            }
            if(index == length) {
                index = 0;
                if(ranks[rank] != 0) {
                    while(index < startIndex) {
                        if(ranks[rank] == 0) break;
                        if(priorities[index] == rank) {
                            ranks[rank]--;
                            answer[index] = order++;
                        }
                        index++;
                    }
                }
            }
            rank--;  
        }
        
        return answer[location];
    }
}