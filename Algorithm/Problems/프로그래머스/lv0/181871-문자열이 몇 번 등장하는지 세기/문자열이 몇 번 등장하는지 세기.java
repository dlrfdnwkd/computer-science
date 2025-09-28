class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int length = myString.length();
        int targetLength = pat.length();

        for (int i = 0; i <= length - targetLength; i++) {
            if (myString.regionMatches(i, pat, 0, targetLength)) {
                answer++;
            }
        }

        return answer;
    }
}