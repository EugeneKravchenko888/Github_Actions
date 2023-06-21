package ru.netology.Github_Action.statistic;
public class Service {
        public long findMax(long[] incomes) {
            long currentMax = incomes[0];
            for (long income : incomes) {
                if (currentMax < income) {
                    currentMax = income;
                }
            }
            return currentMax;
        }
}