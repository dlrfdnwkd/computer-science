/*
* 최소 이동거리는 먼 집부터 배달할 경우
* 인덱스로 배달/수거 먼 곳부터 방문
*/
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int deliveryIndex = n - 1;
        int pickupIndex = n - 1;
        
        while(deliveryIndex > -1 || pickupIndex > -1) {
            int max = 0;
            int deliveryCount = cap;
            int pickupCount = cap;
            
            for(;deliveryIndex >= 0;deliveryIndex--) {
                if(deliveries[deliveryIndex] > 0) {
                    max = Math.max(max,deliveryIndex + 1);
                    if(deliveries[deliveryIndex] - deliveryCount > 0) {
                        deliveries[deliveryIndex] -= deliveryCount;
                        deliveryCount = 0;
                        break;
                    } else {
                        deliveryCount -= deliveries[deliveryIndex];
                        deliveries[deliveryIndex] = 0;
                    }
                }
            }
            for(;pickupIndex >= 0;pickupIndex--) {
                if(pickups[pickupIndex] > 0) {
                    max = Math.max(max,pickupIndex + 1);
                    if(pickups[pickupIndex] - pickupCount > 0) {
                        pickups[pickupIndex] -= pickupCount;
                        pickupCount = 0;
                        break;
                    } else {
                        pickupCount -= pickups[pickupIndex];
                        pickups[pickupIndex] = 0;
                    }
                }
            }
            answer += max;
        }
        
        return answer * 2;
    }
}