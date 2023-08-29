package ru.netology.stats.hmarrays.services;
public class StatService {
    public double amountSales (double[] sales) {
        double selling = 0;
        for (double element : sales) {
            selling += element;
        }
        return (long) selling;
    }
    public double averageSale(double[] sales) {
        double selling = 0;
        for (double element : sales) {
            selling += element;
        }
        return selling / sales.length;
    }
    public double maxSales(double[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
            Math.max(maxMonth, sales[i]);
        }
        return maxMonth + 1;
    }
    public int minSales(double[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
            Math.max(minMonth, sales[i]);
        }
        return minMonth + 1;
    }
    public double belowAverageSales(double[] sales) {
        double selling = 0;
        for (double element : sales) {
            selling += element;
        }
        double averageAmount = selling / sales.length;
        long month = 0;
        for (int i = 1; i < sales.length; i++) {
            if (averageAmount > sales[i])
                month++;
        }
        return month;
    }
    public double aboveAverageSales(double[] sales) {
        double selling = 0;
        for (double element : sales) {
            selling += element;
        }
        double averageAmount = selling / sales.length;
        long month = 0;
        for (int i = 1; i < sales.length; i++) {
            if (averageAmount < sales[i])
                month++;
        }
        return month;
    }
}