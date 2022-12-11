package com.darlp.advent2022.days.two;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsTest {

    @Test
    public void forDemo() {
        var input = """
                A Y
                B X
                C Z""";

        var sum = RockPaperScissors.calculateTotalScore(input);

        var expectedTotalScore = 15;
        assertEquals(sum, expectedTotalScore);
    }

    @Test
    public void forRealInput() throws IOException {
        String tactic = Files.readString(Path.of("src/main/resources/input/day2.txt"));
        var sum = RockPaperScissors.calculateTotalScore(tactic);
        System.out.println(sum);
        assertEquals(9759, sum);
    }

    @Test
    public void forDemoExercise2() {
        var input = """
                A Y
                B X
                C Z""";

        var sum = RockPaperScissors.calculateTotalScoreExercise2(input);

        var expectedTotalScore = 12;
        assertEquals(sum, expectedTotalScore);
    }


    @Test
    public void forExercise2t() throws IOException {
        String tactic = Files.readString(Path.of("src/main/resources/input/day2.txt"));
        var sum = RockPaperScissors.calculateTotalScoreExercise2(tactic);
        System.out.println(sum);
        assertEquals(12429, sum);
    }


}
