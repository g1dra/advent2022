package com.darlp.advent2022.days.one;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CountingCaloriesTest {
    String caloriesList = """
            1000
            2000
            3000

            4000

            5000
            6000

            7000
            8000
            9000

            10000""";

    @Test
    public void exercise1Sample() {
        var maxCalories = CountingCalories.findMaxCalories(caloriesList);
        assertEquals(24000, maxCalories.get(maxCalories.size() - 1));
    }

    @Test
    public void exercise2Sample() {
        var maxCalories = CountingCalories.findMaxCalories(caloriesList);
        var subList = maxCalories.subList(maxCalories.size() - 3, maxCalories.size());
        assertEquals(45000, subList.stream().reduce(0, Integer::sum));
    }

    @Test
    public void day1Solution() throws IOException {
        String caloriesListFile = Files.readString(Path.of("src/main/resources/input/day1.txt"));
        var maxCalories = CountingCalories.findMaxCalories(caloriesListFile);
        assertEquals(66306, maxCalories.get(maxCalories.size() - 1));
        var top3 = maxCalories.subList(maxCalories.size() - 3, maxCalories.size()).stream().reduce(0, Integer::sum);
        assertEquals(195292, top3);
    }
}