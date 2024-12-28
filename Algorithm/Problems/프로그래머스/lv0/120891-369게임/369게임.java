class Solution {

    public int solution(int order) {
        int answer = 0;
        while (order > 0) {
            int remainder = order % 10;
            switch (remainder) {
                case 3:
                case 6:
                case 9:
                    answer++;
                    break;
                default:
                    break;
            }
            order /= 10;
        }
        return answer;
    }
}