class Solution {
    public int solution(String s) {
        String[] tokens = s.split(" ");
        int sum = 0;
        int lastValue = 0;

        for (String token : tokens) {
            if ("Z".equals(token)) {
                sum -= lastValue;
            } else {
                lastValue = Integer.parseInt(token);
                sum += lastValue;
            }
        }

        return sum;
    }
}