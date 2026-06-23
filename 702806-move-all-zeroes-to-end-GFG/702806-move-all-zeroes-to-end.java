class Solution {
    void pushZerosToEnd(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[c]=arr[i];
                c++;
            }
        }
        for(int j=c;j<arr.length;j++){
            arr[j]=0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna