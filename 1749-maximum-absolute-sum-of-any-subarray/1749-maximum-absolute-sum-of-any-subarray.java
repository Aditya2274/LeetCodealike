class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentPrefix = 0;
        int maxPrefix = 0;
        int minPrefix = 0;
        
        for (int num : nums) {
            currentPrefix += num;
            maxPrefix = Math.max(maxPrefix, currentPrefix);
            minPrefix = Math.min(minPrefix, currentPrefix);
        }
        return maxPrefix - minPrefix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna