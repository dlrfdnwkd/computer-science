import java.util.Map;

class Solution {
    private static final Map<String, String> NUMBER_MAP = Map.of(
        "zero", "0", "one", "1", "two", "2", "three", "3", "four", "4",
        "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9"
    );

    public long solution(String numbers) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (char c : numbers.toCharArray()) {
            currentWord.append(c);
            String word = currentWord.toString();
            if (NUMBER_MAP.containsKey(word)) {
                result.append(NUMBER_MAP.get(word));
                currentWord.setLength(0);
            }
        }

        return Long.parseLong(result.toString());
    }
}