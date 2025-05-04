class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[getMinPowerNumber(arr.length)];

        System.arraycopy(arr, 0, answer, 0, arr.length);

        return answer;
    }

    // 1. 입력된 숫자가 2의 거듭제곱인지 확인(거듭제곱인 경우 맨 앞의 수가 1이고 그 뒤는 0인 것을 활용)
    // 2. 2의 거듭제곱이 아닌 경우 n보다 작은 최대 거듭제곱을 가져와 비트를 하나 쉬프트 한 값 반환(<< → 2배)
    private int getMinPowerNumber(int n) {
        if ((n & (n - 1)) == 0) {
            return n;
        }
    return Integer.highestOneBit(n) << 1;
}

}