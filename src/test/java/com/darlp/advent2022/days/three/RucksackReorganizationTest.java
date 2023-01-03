package com.darlp.advent2022.days.three;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class RucksackReorganizationTest {
    @Test
    public void forSampleData() {
        var sample = """
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw
                """;

        var result = RucksackReorganization.prioritizeItemRearrangement(sample);
        assertEquals(157, result);
    }

    @Test
    public void exercise1() throws IOException {
        String supplies = Files.readString(Path.of("src/main/resources/input/day3.txt"));
        var sum = RucksackReorganization.prioritizeItemRearrangement(supplies);
        log.info("Sum" + sum);

    }
}
