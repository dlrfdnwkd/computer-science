class Solution
{
    public int solution(int n, int a, int b)
    {
        //최대 라운드 횟수(거듭제곱)
        int answer = root(n);
        //중간값(int일시 짝수를 포함)과 2의 제곱값
        double half = n / 2 + 0.5;
        int standard = n / 2;
        //중간값을 기준으로 다른구역이면 그때 최대횟수 아니면 왼쪽 오른쪽 중간값 계산
        while(answer >= 2){
            if((a <= half && b >= half) || (a >= half && b <= half)) break;
            else{
                standard /= 2;
                answer--;
                if(a <= half) half -= standard;
                else half += standard;
            }
        }

        return answer;
    }
    //거듭제곱
    public int root(int n){
        if(n == 1) return 0;
        return root(n / 2) + 1;
    }
}