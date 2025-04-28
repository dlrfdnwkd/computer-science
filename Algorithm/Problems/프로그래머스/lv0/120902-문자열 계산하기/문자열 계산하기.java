class Solution {
    public int solution(String my_string) {
        int result = 0;
        boolean add = true;

        for (String token : my_string.split(" ")) {
            switch (token) {
                case "+" -> add = true;
                case "-" -> add = false;
                default  -> result += (add ? 1 : -1) * Integer.parseInt(token);
            }
        }

        return result;
    }
}