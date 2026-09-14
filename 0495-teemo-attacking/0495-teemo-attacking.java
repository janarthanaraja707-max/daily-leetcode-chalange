class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = duration;

        for (int i = 1; i < timeSeries.length; i++) {
            int diff = timeSeries[i] - timeSeries[i - 1];

            if (diff < duration) {
                total += diff;
            } else {
                total += duration;
            }
        }

        return total;
    }
}