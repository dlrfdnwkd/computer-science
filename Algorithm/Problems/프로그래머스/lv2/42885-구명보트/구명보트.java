import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        //몸무게순으로 정렬
        Arrays.sort(people);
        //왼쪽 인덱스 값
        int start = 0;
        //무거운 사람 가벼운 사람 보트 가능한지 확인
        //무게가 제한무게 반 이하로 떨어지면 2명씩 가능(나머지 인원 홀수인 경우 +1)
        for(int i = people.length - 1;i >= start;i--){
            if(people[i] <= limit / 2){
                if((i - start + 1) % 2 == 0) answer += (i - start + 1) / 2;
                else answer += (i - start + 1) / 2 + 1;
                break;
            }else{
                if(people[i] + people[start] <= limit) start++;
                answer++;
            }
        }
        
        return answer;
    }
}