class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1, high = max;
        while (low < high) {
            int mid = low + (high - low) / 2;

            int total = calculateTotalHours(piles, mid);

            if (total <= h) {
                high = mid; // ✅ keep mid, don’t skip it
            } else {
                low = mid + 1;
            }
        }
        return low; // ✅ low == high is the answer
    }

    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        for (int bananas : v) {
            totalH += Math.ceil((double) bananas / hourly);
        }
        return totalH;
    }
}
