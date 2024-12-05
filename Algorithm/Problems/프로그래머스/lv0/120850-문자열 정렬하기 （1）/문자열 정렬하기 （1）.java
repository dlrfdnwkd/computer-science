class Solution {
    public int[] solution(String myString) {
        return myString.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sorted()
                .toArray();
    }
}
