package katas.exercises;

import static katas.exercises.StockTrader2.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StockTrader2Test {

    @Test
    public void testMaxProfit() {



        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expectedProfit1 = 7;
        assertEquals(expectedProfit1, maxProfit(prices1), "The maximum profit should be 7");
        int[] prices2 = {7, 6, 4, 3, 1};
        int expectedProfit2 = 0;
        assertEquals(expectedProfit2, maxProfit(prices2), "The maximum profit should be 0");
        int[] prices3 = {1, 2, 3, 4, 5};
        int expectedProfit3 = 4;
        assertEquals(expectedProfit3, maxProfit(prices3), "The maximum profit should be 4");
        int[] prices4 = {1, 10};
        int expectedProfit4 = 9;
        assertEquals(expectedProfit4, maxProfit(prices4), "The maximum profit should be 9");
        int[] prices5 = {5};
        int expectedProfit5 = 0;
        assertEquals(expectedProfit5, maxProfit(prices5), "The maximum profit should be 0");
        int[] prices6 = null;
        int expectedProfit6 = 0;
        assertEquals(expectedProfit6, maxProfit(prices6), "The maximum profit should be 0");



    }
}
