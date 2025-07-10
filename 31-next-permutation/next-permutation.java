class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        int index2 =-1;
        
        if(index!=-1){
            for(int j=nums.length-1; j>index; j--){
                if(nums[j]>nums[index]){
                    index2=j;
                    break;
                }
            }
            swap(nums, index, index2);
        }
        reverse(nums,index+1, nums.length-1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums, start++, end--);
        }
    }
}