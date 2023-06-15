import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
/**
 * 도형이 그려지는 경우 - 방문했던 점을 다시 방문
 * 중복방문 시 도형 추가. 단, 이미 그려져 있는 간선인 경우 제외
 * 방문한 점은 Map을 통해 관리, 연결된 점은 각 set에 저장
 * 교차일 경우를 고려해 칸 간격을 2칸으로 번형
 */
class Solution {
    
    public int solution(int[] arrows) {
        
        class Point {
            
            int x;
            int y;
            
            Point(int x,int y) {
                this.x = x;
                this.y = y;
            }
            
            @Override
            public boolean equals(Object object) {
                if(this == object) return true;
                if(object != null && getClass() == object.getClass()) {
                    Point point = (Point) object;
                    if(this.x == point.x && this.y == point.y) return true;
                }
                return false;
            }
            
            @Override
            public int hashCode() {
                final int prime = 43;
                int result = 19;
            
                result = prime * result * x * y;
                return result;     
            }
            
        }
        
        int answer = 0;
        Map<Point,Set<Point>> visitedPoints = new HashMap<>();
        Point currentPoint = new Point(0,0);
        visitedPoints.put(currentPoint,new HashSet<>());
        int[] directionX = { 0, 1, 1, 1, 0,-1,-1,-1};
        int[] directionY = { 1, 1, 0,-1,-1,-1, 0, 1};
        
        for(int arrow : arrows) {
            for(int i = 0;i < 2;i++) {
                Point nextPoint = new Point(currentPoint.x + directionX[arrow],currentPoint.y + directionY[arrow]);
                if(visitedPoints.containsKey(nextPoint)) {
                    Set<Point> connectedPoints = visitedPoints.get(nextPoint);
                    boolean isConnected = connectedPoints.contains(currentPoint);
                    if(!isConnected) {
                        connectedPoints.add(currentPoint);
                        visitedPoints.get(currentPoint).add(nextPoint);
                        answer++;
                    }
                } else {
                    visitedPoints.put(nextPoint,new HashSet<>());
                    visitedPoints.get(nextPoint).add(currentPoint);
                    visitedPoints.get(currentPoint).add(nextPoint);
                }
                currentPoint = nextPoint;
            }
        }
        
        return answer;
    }
    
}