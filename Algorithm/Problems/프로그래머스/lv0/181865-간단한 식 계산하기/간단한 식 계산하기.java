class Solution {
    public int solution(String binomial) {
        String[] elements = binomial.split(" ");
        int a = Integer.parseInt(elements[0]);
        String operator = elements[1];
        int b = Integer.parseInt(elements[2]);

        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default  -> 0;
        };
    }
}
