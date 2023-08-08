import java.util.Arrays;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        //알파벳 전환
        for(int i = 0;i < length;i++) {
            char letter = name.charAt(i);
            answer += Math.min(letter - 'A','Z' - letter + 1);
        }
        
        if(answer == 0) return 0;

        //최소 움직임
        int moves = 0;
        int left = 0,right = 0;
        //오른쪽으로만 갈 경우
        for(int i = length - 1;i >= 0;i--) {
            if(name.charAt(i) != 'A') {
                right = i;
                break;
            }
        }
        moves = right;
        //왼쪽으로만 갈 경우
        for(int i = 1;i < length;i++) {
            if(name.charAt(i) != 'A') {
                left = length - i;
                break;
            }
        }
        moves = Math.min(moves,left);
        //U턴을 할 경우
        //앞으로 갈 경우
        for(int i = 0;i < length;i++) {
            if(name.charAt(i) != 'A') {
                int j = i + 1;
                for(;j < length;j++) {
                    if(name.charAt(j) != 'A') break;
                }
                if(j == length) j = 0;
                moves = Math.min(moves,i * 2 + length - j);
            }
        }
        //뒤로 갈 경우
        for(int i = length - 1;i > 0;i--) {
            if(name.charAt(i) != 'A') {
                int j = i - 1;
                for(;j > 0;j--) {
                    if(name.charAt(j) != 'A') break;
                }
                moves = Math.min(moves,(length - i) * 2 + j);
            }
        }
        
        answer += moves;      
            
        return answer;
    }
}