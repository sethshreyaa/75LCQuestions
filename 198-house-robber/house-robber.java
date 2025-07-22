class Solution {
    public int rob(int[] nums) {
        int rob = 0;      // Max money if we rob current house
        int notRob = 0;   // Max money if we don't rob current house

        for (int num : nums) {
            int newRob = notRob + num;          // Rob this house
            notRob = Math.max(notRob, rob);     // Update notRob
            rob = newRob;                       // Update rob
        }
        return Math.max(rob, notRob);
    }
} 
