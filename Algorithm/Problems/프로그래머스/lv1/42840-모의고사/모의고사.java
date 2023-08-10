class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int maxScore = 0;
        int answerSize = 0;
        int[] scores = new int[3];
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0;i < answers.length;i++){
            if(a[i % 5] == answers[i]) scores[0]++;
            if(b[i % 8] == answers[i]) scores[1]++;
            if(c[i % 10] == answers[i]) scores[2]++;   
        }
        
        if(scores[0] > maxScore) {
            maxScore = scores[0];
            answerSize = 1;
        }
        if(scores[1] > maxScore) {
            maxScore = scores[1];
            answerSize = 1;
        }else if(scores[1] == maxScore) answerSize++;
        if(scores[2] > maxScore) {
            maxScore = scores[2];
            answerSize = 1;
        } else if(scores[2] == maxScore) answerSize++;
        
        answer = new int[answerSize];
        int answerIndex = 0;
        for(int i = 0;i < scores.length;i++) {
            if(maxScore == scores[i]) {
                answer[answerIndex] = i + 1;
                answerIndex++;
            }
        }
        
        return answer;
    }
}