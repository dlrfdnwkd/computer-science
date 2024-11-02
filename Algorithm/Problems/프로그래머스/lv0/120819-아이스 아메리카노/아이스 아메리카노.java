class Solution {
    public int[] solution(int money) {
        final int COFFEE_PRICE = 5500;
        
        return new int[] { money / COFFEE_PRICE, money % COFFEE_PRICE };
    }
}