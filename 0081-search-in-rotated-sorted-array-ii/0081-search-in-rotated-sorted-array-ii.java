class Solution {
    public boolean search(int[] nums, int target) {
        int lo=0,hi=nums.length-1;int mid=0;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid] == target) return true;
            if(nums[lo]==nums[mid] && nums[mid]==nums[hi]){
                lo++;
                hi--;
                continue;
            }
            if(nums[lo]<=nums[mid]){
                if(nums[lo] <= target && target < nums[mid]){
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            else{
                if(nums[mid] < target && target <=nums[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return false; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna