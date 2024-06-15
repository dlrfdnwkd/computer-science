import java.util.Arrays;

class Solution {

    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}