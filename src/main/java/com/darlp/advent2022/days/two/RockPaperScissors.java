package com.darlp.advent2022.days.two;

public class RockPaperScissors {
    public static Integer calculateTotalScore(String input) {
        var lines = input.lines();
        return lines.map(line -> {
                    var me = line.substring(2, 3);
                    Integer score = 0;
                    switch (me) {
                        case "X" -> score += 1;
                        case "Y" -> score += 2;
                        case "Z" -> score += 3;
                    }

                    switch (line) {
                        case ("A X"), ("B Y"), ("C Z") -> score += 3;
                        case ("A Y"), ("B Z"), ("C X") -> score += 6;
                    }

                    return score;
                }).mapToInt(Integer::valueOf)
                .sum();
    }
    
    public static Integer calculateTotalScoreExercise2(String input) {
        var lines = input.lines();
        return lines.map(line -> {
                    var me = line.substring(2, 3);
                    Integer score = 0;
                    switch (me) {
                        case "X" -> score += 0;
                        case "Y" -> score += 3;
                        case "Z" -> score += 6;
                    }

                    switch (line) {
                        case ("B X"), ("A Y"), ("C Z") -> score += 1;
                        case ("C X"), ("B Y"), ("A Z") -> score += 2;
                        case ("A X"), ("C Y"), ("B Z") -> score += 3;
                    }
                    return score;
                }).mapToInt(Integer::valueOf)
                .sum();

    }
}
