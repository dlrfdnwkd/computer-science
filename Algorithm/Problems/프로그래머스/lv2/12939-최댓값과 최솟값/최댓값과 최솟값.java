class Solution {
    public String solution(String s) {
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (String character : s.split(" ")) {
            int number = Integer.parseInt(character);
            maxNumber = Math.max(maxNumber, number);
            minNumber = Math.min(minNumber, number);
        }

        return String.format("%d %d", minNumber, maxNumber);
    }
}