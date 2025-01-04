class Solution {
    public int solution(int n, int k) {
        int lambPrice = 12_000;
        int drinkPrice = 2_000;
        int totalCost = n * lambPrice + k * drinkPrice;
        int discount = Math.min(n / 10, k) * drinkPrice;

        return totalCost - discount;
    }
}