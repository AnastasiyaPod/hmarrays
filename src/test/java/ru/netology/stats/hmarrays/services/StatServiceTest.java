package ru.netology.stats.hmarrays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void amountSales() {
        StatService service = new StatService();
        double[] sales = {15, 11, 19.4, 21, 16, 18, 21.4, 18, 15, 31, 14, 5};
        long expectedSum = 204;
        long actualSum = (long) service.amountSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSale() {
        StatService service = new StatService();
        double[] sales = {15, 11, 19.4, 21, 16, 18, 21.4, 18, 15, 31, 14, 5};
        long expectedAverageSale = 17;
        long actualAverageSale = (long) service.averageSale(sales);
        Assertions.assertEquals(expectedAverageSale, actualAverageSale);
    }

    @Test
    public void maxSales() {
        StatService service = new StatService();
        double[] sales = {15, 11, 19.4, 31, 16, 18, 21.4, 18, 15, 31, 14, 5};
        long expectedMaxSale = 10;
        long actualMaxSale = (long) service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSale, actualMaxSale);
    }

    @Test
    public void minSales() {
        StatService service = new StatService();
        double[] sales = {15, 11, 19.4, 31, 16, 18, 21.4, 18, 15, 31, 14, 5};
        long expectedMinSale = 12;
        long actualMinSale = service.minSales(sales);
        Assertions.assertEquals(expectedMinSale, actualMinSale);
    }

    @Test
    public void belowAverageSales() {
        StatService service = new StatService();
        double[] sales = {15, 11, 19.4, 31, 16, 18, 21.4, 18, 15, 31, 14, 5};
        long expectedMonths = 5;
        long actualMonths = (long) service.belowAverageSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);

    }

    @Test
    public void aboveAverageSales() {
        StatService service = new StatService();
        double[] sales = {15, 11, 19.4, 31, 16, 18, 21.4, 18, 15, 31, 14, 5};
        long expectedMonths = 6;
        long actualMonths = (long) service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}