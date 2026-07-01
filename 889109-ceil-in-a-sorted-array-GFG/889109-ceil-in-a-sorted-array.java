class Solution {
    public int findCeil(int[] arr, int x) {
        int l = 0, h = arr.length - 1;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] >= x) {
                ans = mid;      // store INDEX, not value
                h = mid - 1;    // look for an earlier occurrence
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna