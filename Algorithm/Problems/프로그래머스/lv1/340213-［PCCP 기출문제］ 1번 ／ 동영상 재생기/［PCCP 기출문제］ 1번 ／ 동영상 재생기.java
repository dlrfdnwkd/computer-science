class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoEndTime = toMinutes(video_len);
        int currentTime = toMinutes(pos);
        int openingStart = toMinutes(op_start);
        int openingEnd = toMinutes(op_end);

        currentTime = adjustForOpening(openingStart, openingEnd, currentTime);

        for (String command : commands) {
            switch(command) {
                case "next" -> currentTime += 10;
                case "prev" -> currentTime -= 10;
            }

            currentTime = Math.min(Math.max(0, currentTime), videoEndTime);
            currentTime = adjustForOpening(openingStart, openingEnd, currentTime);
        }

        return String.format("%02d:%02d", currentTime / 60, currentTime % 60);
    }

    public int adjustForOpening(int startMinutes, int endMinutes, int nowMinutes) {
        return startMinutes <= nowMinutes && nowMinutes <= endMinutes ? endMinutes : nowMinutes;
    }

    public int changeMinutes(int[] time) {
        return time[0] * 60 + time[1];
    }

    public int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public String toString(int time) {
        return time / 10 > 0 ? String.valueOf(time) : "0" + time;
    }
}