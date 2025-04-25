package blind_75;

public class BestTimeToBuySell_121 {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++) {
            int profit = prices[i] - buyingPrice;
            maxProfit = Math.max(maxProfit, profit);
            if (buyingPrice > prices[i]) {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
