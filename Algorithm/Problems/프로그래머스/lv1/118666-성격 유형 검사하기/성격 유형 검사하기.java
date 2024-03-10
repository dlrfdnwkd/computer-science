class Solution {
    
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[][] mbti = { {"R","T"}, {"C","F"}, {"J","M"}, {"A","N"} };
        int[] scores = new int[4];
        
        for (int i = 0; i < survey.length; i++) {
            int j = 0;
            for (; j < mbti.length; j++) {
                if (survey[i].indexOf(mbti[j][0]) >= 0) {
                    break;
                }
            }
            
            scores[j] = survey[i].startsWith(mbti[j][0]) ? scores[j] + (choices[i] - 4) * -1 : scores[j] + choices[i] - 4;
        }
        
        for(int i = 0; i < scores.length; i++){
            answer = scores[i] >= 0 ? answer + mbti[i][0] : answer + mbti[i][1];
        }
        
        return answer;
    }
}