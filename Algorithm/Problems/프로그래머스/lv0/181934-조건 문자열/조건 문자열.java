class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        boolean isEquals = eq.equals("=");

        switch (ineq) {
            case ">":
                answer = isEquals ? n >= m : n > m;
                break;
            case "<":
                answer = isEquals ? n <= m : n < m;
                break;
            default:
                break;
        }

        return answer ? 1 : 0;
    }
}