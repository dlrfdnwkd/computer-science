import java.util.HashMap;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = brown + yellow;i > 0;i--){
            if((brown + yellow) % i == 0){
                if(i >= (brown + yellow) / i){
                    map.put(i,(brown + yellow) / i);
                }
            }
        }
        //상하좌우 겹치는 4칸 제외 후 갯수 확인
        for(Integer key : map.keySet()){
            if(key * 2 + map.get(key) * 2 - 4 == brown){
                answer[0] = key;
                answer[1] = map.get(key);
                break;
            }
        }
        return answer;
    }
}