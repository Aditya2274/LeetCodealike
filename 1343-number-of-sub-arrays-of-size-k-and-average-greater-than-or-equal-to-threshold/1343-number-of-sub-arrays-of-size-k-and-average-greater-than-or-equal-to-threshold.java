class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int targetsum=k*threshold;
        int c=0;
        int currsum=0;
        for(int i=0;i<k;i++){
            currsum+=arr[i];
        }
        if(currsum>=targetsum) c++;
        for(int i=k;i<arr.length;i++){
            currsum=currsum+arr[i]-arr[i-k];
            if(currsum>=targetsum) c++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna