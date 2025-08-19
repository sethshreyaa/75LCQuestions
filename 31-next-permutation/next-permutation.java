class Solution {
    public void nextPermutation(int[] nums) {
        int a =-1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                a=i-1;
            }
        }
        if(a==-1){
            reverse(nums,0, nums.length-1);
            return;
        }

        for(int j=nums.length-1; j> a; j--){
            if(nums[j]>nums[a]){
                int temp = nums[a];
                nums[a]=nums[j];
                nums[j] = temp;
                break;
            }
        }

        reverse(nums, a+1, nums.length-1);
        
    }

    private void reverse(int[] arr,int a,int b){
        while (a < b) {
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
            a++;
            b--;
        }
    }
}