class Solution {
    public void sortColors(int[] nums) {
        int mid=0,hi=nums.length-1,low=0;
        while(mid<=hi){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,hi);
                hi--;
            }
            else if(nums[mid]==1){
                mid++;
            }
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna