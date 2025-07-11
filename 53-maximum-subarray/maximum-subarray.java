class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length==1) return nums[0];
        int max = Integer.MIN_VALUE, sum=0;
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];

            if( sum> max) max =sum;

            if(sum<0) sum=0;
        }
        return max;
    }
}