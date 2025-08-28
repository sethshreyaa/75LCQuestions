class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int mid=-1;
        int result =-1;
        if(x<=1) return x;
        while(low <= high){
            mid = (low + high)/2;
            long sq = (long) mid * mid; 
            if(sq==x){
                return mid;
            }else if(sq<x){
                result = Math.max(result, mid);
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }

        return result;
    }
}