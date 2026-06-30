class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        boolean flag=false;
        int n=nums.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                flag=true;
                break;
            }
            else if(nums[mid]<target) lo=mid+1;
            else if(nums[mid]>target) hi=mid-1;
        }
        if(flag){
            int fp=n;
            lo=0; hi=n-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(nums[mid]>=target){
                      fp=Math.min(fp,mid);
                       hi=mid-1;
                }
                else lo=mid+1;
            }
            ans[0]=fp;
            int lp=n;
            lo=0; hi=n-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(nums[mid]>target){
                      lp=Math.min(lp,mid);
                       hi=mid-1;
                }
                else lo=mid+1;
            }
            ans[1]=lp-1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna