import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int food : scoville) {
            queue.add(food);
        }
        
        while(queue.peek() < K) {
            if(queue.size() < 2) {
                answer = -1;
                break;
            }
            
            int first = queue.poll();
            int second = queue.poll();
            
            int newValue = first + second * 2;
            queue.add(newValue);
            answer++;
        }
        
        return answer;
    }
}