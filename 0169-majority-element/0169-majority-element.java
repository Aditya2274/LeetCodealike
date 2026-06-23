class Solution {
    public int majorityElement(int[] nums) {
        int c=0; int candidate=0;
        for(int val: nums){
            if(c==0){
                candidate=val;
            }
            if(val==candidate) c++;
            else c--;
        }
        return candidate;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna