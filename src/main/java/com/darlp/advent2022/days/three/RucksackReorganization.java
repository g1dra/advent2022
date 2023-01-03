package com.darlp.advent2022.days.three;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class RucksackReorganization {
    public static int prioritizeItemRearrangement(String sample) {
        return  sample.lines().mapToInt(line -> {
            var firstPart = line.substring(0, line.length() / 2);
            var secondPart = line.substring(line.length() / 2);
            log.info(firstPart);
            log.info(secondPart);
            var totalScore = 0;
            var buffer = new ArrayList<Character>();
            for (char item1 : firstPart.toCharArray()) {
                if (secondPart.indexOf(item1) != -1 && !buffer.contains(item1)) {
                    buffer.add(item1);
                    log.info(String.valueOf(item1));
                    int temp = (int) item1;
                    int temp_integer = 96; //for lower case
                    if (temp <= 122 & temp >= 97) {
                        log.info(String.valueOf(temp - temp_integer));
                        totalScore += temp - temp_integer;
                    }

                    int temp_integer2 = 64; //for upper case
                    if (temp <= 90 & temp >= 65) {
                        log.info(String.valueOf(temp - temp_integer2 + 26));
                        totalScore += temp - temp_integer2 + 26;
                    }
                }
            }
            buffer.clear();
            System.out.println();
            return totalScore;
        }).sum();
    }
}
