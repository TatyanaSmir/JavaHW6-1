package ru.netology.stats;

public class StatsService {

    public static int sumOfSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static int averageSumOfSales(int[] sales) {
        int averageSum = sumOfSales(sales) / sales.length;
        return averageSum;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthOfLowSales(int[] sales) {
        int lowMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumOfSales(sales)) {
                lowMonth++;
            }
        }
        return lowMonth;
    }

    public int monthOfHightSales(int[] sales) {
        int hightMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumOfSales(sales)) {
                hightMonth++;
            }
        }
        return hightMonth;

    }


}