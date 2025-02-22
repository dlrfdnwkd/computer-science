class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] attackPowers = {5, 3, 1};

        for (int power : attackPowers) {
            answer += hp / power;
            hp %= power;
        }
        return answer;
    }
}
