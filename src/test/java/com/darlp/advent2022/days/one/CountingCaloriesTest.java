package com.darlp.advent2022.days.one;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CountingCaloriesTest {
    @Test
    public void day1demo() {
        var caloriesList = """
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

        var maxCalories = CountingCalories.findMaxCalories(caloriesList);
        assertEquals(24000, maxCalories);
    }

    @Test
    void exercise1() throws IOException {
        assertEquals(66306, CountingCalories.exercise1() );
    }
}