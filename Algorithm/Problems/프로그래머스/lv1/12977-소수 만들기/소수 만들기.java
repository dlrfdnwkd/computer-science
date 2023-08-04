class Solution {
    //소수 갯수
    int prime_numbers=0;
    
    public int solution(int[] nums) {
        combination(nums,0,0,0);

        return prime_numbers;
    }
    //조합
    public void combination(int[] nums,int start,int count,int num){
        if(count==3){
            if(prime_number(num)) prime_numbers++;
            return;
        }
        for(int i=start;i<nums.length;i++){
            combination(nums,i+1,count+1,num+nums[i]);
        }
    }
    //소수판별
    public boolean prime_number(int number){
        for(int i=number-1;i>1;i--){
            if(number%i==0) return false;
        }
        return true;
    }
}