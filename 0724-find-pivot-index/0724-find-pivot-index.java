class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       for(int i=0;i<n;i++){
         int left=0,right=0;
         for(int j=0;j<i;j++){
            left+=nums[j];
         }
         for(int j=i+1;j<n;j++){
            right+=nums[j];
         }
         if(left==right){
            return i;
         }
       }
       return -1;
    }
}
//Brute force

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna