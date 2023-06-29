/**
* 원쿠션으로 맞출 경우 4가지 길이 존재
* 위쪽 쿠션,아래쪽 쿠션,왼쪽 쿠션,오른쪽 쿠션
* 단, 상하좌우 중 일직선에 공이 존재하면 해당경로는 불가(벽에 맞기전에 볼을 먼저 맞춤)
* 경로의 길이는 목표 공을 반전시켜 경로를 일직선으로 변환
*/
class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        
        for(int i=0;i<answer.length;i++) {
            int minLength = Integer.MAX_VALUE;
            int up = 0, down = 0, left = 0, right = 0;
            int targetX = balls[i][0];
            int targetY = balls[i][1];
            
            if(startX == targetX) {
                if(startY > targetY) {
                    up = n - startY + n - targetY;
                    up = (int) Math.pow(up,2);
                    minLength = Math.min(minLength,up);
                } else {
                    down = startY + targetY;
                    down = (int) Math.pow(down,2);
                    minLength = Math.min(minLength,down);
                }
            } else {
                up = (int) Math.pow(Math.abs(startX - targetX),2) + 
                     (int) Math.pow(n - targetY + n - startY,2);
                minLength = Math.min(minLength,up);
                
                down = (int) Math.pow(Math.abs(startX - targetX),2) +
                       (int) Math.pow(startY + targetY,2);
                minLength = Math.min(minLength,down);
            }
            
            if(startY == targetY) {
                if(startX > targetX) {
                    right = m - startX + m - targetX;
                    right = (int) Math.pow(right,2);
                    minLength = Math.min(minLength,right);
                } else {
                    left = startX + targetX;
                    left = (int) Math.pow(left,2);
                    minLength = Math.min(minLength,left);
                }
            } else {
                right = (int) Math.pow(Math.abs(startY - targetY),2) + 
                        (int) Math.pow(m - targetX + m - startX,2);
                minLength = Math.min(minLength,right);
                
                left = (int) Math.pow(Math.abs(startY - targetY),2) + 
                       (int) Math.pow(startX + targetX,2);
                minLength = Math.min(minLength,left);
            }
            
            answer[i] = minLength;     
        }
        
        return answer;
    }
}