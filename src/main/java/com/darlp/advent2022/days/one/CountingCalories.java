package com.darlp.advent2022.days.one;

import java.util.*;

public class CountingCalories {
    public static List<Integer> findMaxCalories(String caloriesList) {
        var inventory = caloriesList.split("\\R");
        List<String> inventoryList = new ArrayList<>(List.of(inventory));
        var ele = "";
        inventoryList.add(ele);
        var currentCalories = 0;
        List<Integer> caloriesListByElf = new ArrayList<>();

        for (String item : inventoryList) {
            if (Objects.equals(item, "")) {
                caloriesListByElf.add(currentCalories);
                currentCalories = 0;
                continue;
            }
            currentCalories += Integer.parseInt(item);
        }

        Collections.sort(caloriesListByElf);

        return caloriesListByElf;
    }
}
