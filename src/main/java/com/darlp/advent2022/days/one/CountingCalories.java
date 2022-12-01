package com.darlp.advent2022.days.one;

import jakarta.annotation.Resource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class CountingCalories {
    public static Integer findMaxCalories(String caloriesList) {
        var inventory = caloriesList.split("\\R");
        var currentCalories = 0;
        var maxCalories = 0;

        for (String item : inventory) {
            if (Objects.equals(item, "")) {
                maxCalories = Math.max(currentCalories, maxCalories);
                currentCalories = 0;
                continue;
            }
            currentCalories += Integer.parseInt(item);
        }

        System.out.println(maxCalories);
        return maxCalories;
    }

    public static Integer exercise1() throws IOException {
        String caloriesList = Files.readString(Path.of("src/main/resources/input/day1.txt"));
        return findMaxCalories(caloriesList);
    }
}
