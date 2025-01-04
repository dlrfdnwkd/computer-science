class Solution {
    public int solution(int n) {
        int number = 2;
        int result = 1;

        while(result * number <= n) {
            result *= number;
            number++;
        }

        return number - 1;
    }
}