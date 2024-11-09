import java.util.Arrays;

class Solution {
    private enum DiscountTier {
        TIER1(500_000, 20),
        TIER2(300_000, 10),
        TIER3(100_000, 5),
        NO_DISCOUNT(0, 0);

        private final int minPrice;
        private final int discountRate;

        DiscountTier(int minPrice, int discountRate) {
            this.minPrice = minPrice;
            this.discountRate = discountRate;
        }

        public static int getDiscountRate(int price) {
            return Arrays.stream(values())
                         .filter(tier -> price >= tier.minPrice)
                         .findFirst()
                         .orElse(NO_DISCOUNT)
                         .discountRate;
        }
    }

    public int solution(int price) {
        int saleRate = DiscountTier.getDiscountRate(price);
        return price * (100 - saleRate) / 100;
    }
}