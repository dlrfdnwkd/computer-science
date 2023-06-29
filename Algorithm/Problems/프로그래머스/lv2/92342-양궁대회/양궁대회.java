/*
 * 완전탐색으로 라이언 점수 비교
 * 10점 -> 1점으로 경우의 수 계산
 * 역순으로 계산할 시 같은 점수차이라도 후반에 계산한 것이 정답임
 */
class Solution {
    int max = 0;
    int[] answer = {-1};
    
    public int[] solution(int n, int[] info) {
        int[] ryan = new int[11];       
        
        dfs(info,ryan,n);
        
        return answer;
    }
    
    public void dfs(int[] apeach,int[] ryan,int n) {
        if(n == 0) {
            int diff = ryanWin(apeach,ryan);
            if(diff > 0 && diff >= max) {
                max = diff;
                answer = ryan.clone();
            }
            return;
        }
        
        for(int i = 0;i < ryan.length && ryan[i] <= apeach[i];i++) {
                ryan[i]++;
                dfs(apeach,ryan,n-1);
                ryan[i]--;          
        }
    }
    
    public int ryanWin(int[] apeach,int[] ryan){
        int apeachScore = 0,ryanScore = 0;
        
        for(int i = 0;i < apeach.length;i++){
            if(apeach[i] != 0 || ryan[i] != 0){
                if(ryan[i] > apeach[i]) ryanScore += 10 - i;
                else apeachScore += 10 - i;
            }
        }
        
        return ryanScore - apeachScore;
    }
    
}