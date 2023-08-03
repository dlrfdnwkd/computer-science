import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] solution(int[] arr) {     
        Deque<Integer> answer = new LinkedList<>();
        
        for(int element : arr) {
            if(answer.isEmpty() || answer.peekLast() != element) {
                answer.offerLast(element);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}