package ru.netology.service;

public class CustomsService {


    public static final int WEIGHT_RATE = 100;
    public static int calculateCustoms(int price, int weight) {
        int customsFromPriceKopecks = price;
        int customsFromWeightKopecks = weight * WEIGHT_RATE * 100;

        int totalKopecks = customsFromPriceKopecks + customsFromWeightKopecks;
        int totalRubles = totalKopecks / 100;

        return totalRubles;
    }
}
