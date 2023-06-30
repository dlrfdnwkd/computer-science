import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        class PrivacyDate {
            int year;
            int month;
            int day;
            
            PrivacyDate(String year,String month,String day) {
                this.year = Integer.parseInt(year);
                this.month = Integer.parseInt(month);
                this.day = Integer.parseInt(day) - 1;
            }
            
            boolean isBefore(PrivacyDate privacyDate) {
                int yearDiff = year - privacyDate.year;
                int monthDiff = month - privacyDate.month;
                int dayDiff = day - privacyDate.day;

                if(yearDiff != 0) return yearDiff < 0 ? true : false;
                if(monthDiff != 0) return monthDiff < 0 ? true : false;
                
                return dayDiff < 0 ? true : false;
            }
            
            void addMonth(int month) {
                this.month += month;
                
                if(this.month > 12) {
                    if(this.month % 12 == 0) {
                        year += this.month / 12 - 1;
                        this.month = 12;
                    } else {
                        year += this.month / 12;
                        this.month %= 12;
                    }
                }
            }
        }
        
        int[] answer = {};
        String[] todayArray = today.split("\\.");
        PrivacyDate todayDate = new PrivacyDate(todayArray[0],todayArray[1],todayArray[2]);
        //유효기간으로 인한 일 차감 무효
        todayDate.day += 1;
        List<Integer> removedPrivacies = new ArrayList<>();
        HashMap<String,Integer> termMap = new HashMap<>();
        
        for(String term : terms) {
            String[] termArray = term.split(" ");
            termMap.put(termArray[0],Integer.valueOf(termArray[1]));
        }
        
        for(int i = 0;i < privacies.length;i++) {
            String[] privacyArray = privacies[i].split(" ");
            String[] dateArray = privacyArray[0].split("\\.");
            
            PrivacyDate date = new PrivacyDate(dateArray[0],dateArray[1],dateArray[2]);
            date.addMonth(termMap.get(privacyArray[1]));
            if(date.isBefore(todayDate)) {
                removedPrivacies.add(i + 1);
            }
        }
        
        answer = removedPrivacies.stream()
                                 .mapToInt(i -> i)
                                 .toArray();
        
        return answer;
    }
}