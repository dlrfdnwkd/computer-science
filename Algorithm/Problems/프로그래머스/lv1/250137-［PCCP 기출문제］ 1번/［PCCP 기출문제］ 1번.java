class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int time = 0;
        
        answer -= attacks[0][1];
        if(answer < 0) {
            return -1;
        }
        
        for (int i = 1; i < attacks.length; i++) {
            time = attacks[i][0] - attacks[i - 1][0] - 1;
            if(time < 0) {
                time = 0;
            }
            
            int count = time / bandage[0];
            answer += count * bandage[2] + time * bandage[1];
            if(answer > health) {
                answer = health;
            }
            
            answer -= attacks[i][1];
            if(answer <= 0) {
                return -1;
            }
        }
        return answer;
    }
}