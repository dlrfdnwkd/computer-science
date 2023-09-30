import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String[] item : clothes){
            if(map.containsKey(item[1])){
                map.put(item[1], map.get(item[1]) + 1);
            }else{
                map.put(item[1], 1);
            }
        }
        // 집합의 갯수(공집합 제외)
        for(Integer value : map.values()) {
            answer *= (value + 1);
        }
        answer -= 1;
        
        return answer;
    }
}