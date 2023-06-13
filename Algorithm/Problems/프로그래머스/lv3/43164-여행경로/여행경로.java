import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    List<String> routeList;
    
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];
        boolean[] usedTickets = new boolean[tickets.length];
        StringBuilder route = new StringBuilder("ICN");
        routeList = new ArrayList<>();
        
        makeRoute(tickets,usedTickets,"ICN",route);
        
        Collections.sort(routeList);
        String answerString = routeList.get(0);
        for(int answerIndex = 0,stringIndex = 0;answerIndex < answer.length;answerIndex++) {
            answer[answerIndex] = answerString.substring(stringIndex,stringIndex + 3);
            stringIndex += 3;
        }
        
        return answer;
    }
    public void makeRoute(String[][] tickets,boolean[] usedTickets,String currentAirport,StringBuilder route) {
        if(route.length() == (tickets.length + 1) * 3){
            routeList.add(route.toString());
            return;
        }
        
        for(int i = 0;i < tickets.length;i++) {
            if(!usedTickets[i] && currentAirport.equals(tickets[i][0])) {
                usedTickets[i] = true;
                route.append(tickets[i][1]);
                makeRoute(tickets,usedTickets,tickets[i][1],route);
                route.delete(route.length() - 3,route.length());
                usedTickets[i] = false;
            }
        }
    }
}