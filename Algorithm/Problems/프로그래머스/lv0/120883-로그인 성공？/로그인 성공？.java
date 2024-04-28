class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];

        for (String[] info : db) {
            if (id.equals(info[0])) {
                answer = "wrong pw";
                if (pw.equals(info[1])) {
                    answer = "login";
                }
                break;
            }
        }
        return answer;
    }
}