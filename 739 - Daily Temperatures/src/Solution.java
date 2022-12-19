// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

// Constraints:
// 1 <= temperatures.length <= 10^5
// 30 <= temperatures[i] <= 100

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] numberOfDaysUntilWarmerTemperatureByDay = new int[temperatures.length];

        // Store the hottest temperature seen so far. 30 is the minimum possible temperature value according to the constraints.
        int hottestTemperature = 30;

        for (int currentDay = temperatures.length - 1; currentDay >= 0; currentDay--) {
            if (temperatures[currentDay] >= hottestTemperature) {
                hottestTemperature = temperatures[currentDay];
                continue;
            }

            int numberOfDaysUntilWarmerTemperature = 1;
            while (temperatures[currentDay + numberOfDaysUntilWarmerTemperature] <= temperatures[currentDay]) {
                numberOfDaysUntilWarmerTemperature += numberOfDaysUntilWarmerTemperatureByDay[currentDay
                        + numberOfDaysUntilWarmerTemperature];
            }
            numberOfDaysUntilWarmerTemperatureByDay[currentDay] = numberOfDaysUntilWarmerTemperature;
        }

        return numberOfDaysUntilWarmerTemperatureByDay;
    }
}