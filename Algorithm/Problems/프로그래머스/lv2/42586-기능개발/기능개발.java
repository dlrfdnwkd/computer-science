import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0,index = 0;
        
        while (index < progresses.length) {
            if (progresses[index] >= 100) {
                index++;
                count++;
            } else {
                if (count == 0) {
                    for(int i = index; i < progresses.length; i++) {
                        progresses[i] += speeds[i];
                    }
                } else {
                    list.add(count);
                    count = 0;
                }
            }
        }
        list.add(count);
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}