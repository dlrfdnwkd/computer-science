import java.util.Arrays;
import java.util.Comparator;
/*
 * TimeTable 만들어서 해당 입장시간에 +1 청소가 끝난 시간에 -1
 * 예약 시간을 다 입력하면 00:00부터 24:00까지 최대 개수 확인
 */
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] timeTable = new int[1441];
        
        Arrays.sort(book_time, (a,b) -> (a[0].compareTo(b[0])));
        Arrays.toString(book_time);
        
        for(String[] time : book_time) {
            int enterTime = getMinute(time[0]);
            int exitTime = getMinute(time[1]);
            
            if(exitTime + 10 > 1440) exitTime = 1440;
            else exitTime += 10;
            
            timeTable[enterTime] += 1;
            timeTable[exitTime] -= 1;
        }
        
        for(int i = 1; i < timeTable.length; i++){
            timeTable[i] += timeTable[i - 1];
            answer = Math.max(answer, timeTable[i]);
        }
        
        return answer;
    }
    
    public int getMinute(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]); 
    }
    
}