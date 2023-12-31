package ru.netology.Github_Action.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void findMax() {
        ru.netology.Github_Action.statistic.Service service = new Service();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxOne() {
        ru.netology.Github_Action.statistic.Service service = new Service();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 12, 8, 6, 11, 11, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxTwo() {
        ru.netology.Github_Action.statistic.Service service = new Service();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 12, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxThree() {
        ru.netology.Github_Action.statistic.Service service = new Service();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 10, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
