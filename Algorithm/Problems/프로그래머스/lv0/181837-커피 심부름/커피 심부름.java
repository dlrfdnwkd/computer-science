class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for (String coffee : order) {
            answer += coffee.contains("cafelatte") ? 5000 : 4500;
        }

        return answer;
    }
}