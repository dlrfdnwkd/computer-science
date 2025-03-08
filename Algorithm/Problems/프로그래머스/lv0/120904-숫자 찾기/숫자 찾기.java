class Solution {
    public int solution(int num, int k) {
        int index = -1;
        int length = 0;
        
        while (num > 0) {
            if (num % 10 == k) {
                index = length;
            }
            length++;
            num /= 10;
        }

        return index == -1 ? -1 : length - index;
    }
}