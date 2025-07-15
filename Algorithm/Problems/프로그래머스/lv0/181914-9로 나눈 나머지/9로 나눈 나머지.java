class Solution {
    public int solution(String number) {
        int n = 0;

        for (char c : number.toCharArray()) {
            n += c - '0';
        }

        return n % 9;
    }
}