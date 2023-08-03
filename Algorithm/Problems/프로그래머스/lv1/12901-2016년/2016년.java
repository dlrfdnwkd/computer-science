class Solution {
    public String solution(int a, int b) {
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int days = b;
        
        for(int month = 1;month < a;month++){
            if(month != 2) {
                if(month < 8) {
                    if(month % 2 == 0) days += 30;
                    else days += 31;
                } else {
                    if(month % 2 == 0) days += 31;
                    else days += 30;
                }
            } else days += 29;
        }

        return week[days % 7];
    }
}