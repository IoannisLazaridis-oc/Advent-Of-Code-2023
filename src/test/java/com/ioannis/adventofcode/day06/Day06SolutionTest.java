package com.ioannis.adventofcode.day06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day06SolutionTest {

    @Test
    public void testToyBoatRaces() {
        Day06Solution day06 = new Day06Solution();
        int[] times = {41, 66, 72, 66};
        int[] distances = {244, 1047, 1228, 1040};
        long expected = 74698;

        long solution = day06.calculateWinningWays(times, distances);
//        System.out.println(solution);
        assertEquals(expected, solution);
    }

}
