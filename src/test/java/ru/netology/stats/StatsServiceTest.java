package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectSumOfSales = 180;
        int actualSumOfSales = service.sumOfSales(sales);

        Assertions.assertEquals(expectSumOfSales, actualSumOfSales);
    }

    @Test
    public void shouldFindAverageSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectAverageSumOfSales = 15;
        int actualAverageSumOfSales = service.averageSumOfSales(sales);

        Assertions.assertEquals(expectAverageSumOfSales, actualAverageSumOfSales);

    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectMaxMonthSales = 8;
        int actualMaxMonthSales = service.maxSales(sales);

        Assertions.assertEquals(expectMaxMonthSales, actualMaxMonthSales);

    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectMinMonthSales = 9;
        int actualMinMonthSales = service.minSales(sales);

        Assertions.assertEquals(expectMinMonthSales, actualMinMonthSales);


    }


    @Test
    public void shouldFindLowThanAverageSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectMonsLowThanAverageSumOfSales = 5;
        int actualMonsLowThanAverageSumOfSales = service.monthOfLowSales(sales);

        Assertions.assertEquals(expectMonsLowThanAverageSumOfSales, actualMonsLowThanAverageSumOfSales);

    }

    @Test
    public void shouldFindHightThanAverageSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectMonthHighThanAverageSumOfSales = 5;
        int actualMonthHighThanAverageSumOfSales = service.monthOfHightSales(sales);

        Assertions.assertEquals(expectMonthHighThanAverageSumOfSales, actualMonthHighThanAverageSumOfSales);
    }
}
