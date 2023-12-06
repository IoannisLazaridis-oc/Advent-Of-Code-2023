package com.ioannis.adventofcode.day06;

public class Day06Solution {

    public long calculateWinningWays(int[] raceTimes, int[] recordDistances) {
        long totalWinningWays = 1;
        for (int i = 0; i < raceTimes.length; i++) {
            int winningWaysForRace = findWinningWaysForEachRace(raceTimes[i], recordDistances[i]);

            totalWinningWays *= winningWaysForRace;
        }
        return totalWinningWays;
    }


    private int findWinningWaysForEachRace(int raceTime, int recordDistance) {
        int winningWays = 0;
        for (int holdTime = 0; holdTime <= raceTime; holdTime++) {
            int travelTime = raceTime - holdTime;
            int distanceTravelled = holdTime * travelTime;

            if (distanceTravelled > recordDistance) {
                winningWays++;
            }
        }
        return winningWays;
    }


}