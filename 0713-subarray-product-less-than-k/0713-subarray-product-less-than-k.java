class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
          int l=0,ans=0, pro=1;
          for(int r=0;r<nums.length;r++){
             pro*=nums[r];
             while(pro>=k){
                pro/=nums[l];
                l++;
             }
             ans+=(r-l+1);
          }
          if(ans==0) return 0;
          return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna