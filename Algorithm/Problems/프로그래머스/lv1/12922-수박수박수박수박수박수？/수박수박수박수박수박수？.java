class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] patten = {"수","박"};
        int index = 0;
        
        while(index < n){
            answer.append(patten[index % 2]);
            index++;
        }
        
        return answer.toString();
    }
}