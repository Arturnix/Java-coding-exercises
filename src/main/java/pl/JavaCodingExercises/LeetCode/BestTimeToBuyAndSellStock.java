package pl.JavaCodingExercises.LeetCode;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    public static int maximizeProfit(int[] prices) {

        int profit = 0;
        int bestBuyPrice = prices[0];

          for(int price : prices) {
              if(profit < price - bestBuyPrice) {
                  profit = price - bestBuyPrice;
              }
              if(bestBuyPrice > price) {
                  bestBuyPrice = price;
              }
          }
        return profit;
    }
}
