class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int lo=0,hi=arr.length-k;
            while(lo<hi){
                int mid=lo+(hi-lo)/2;
                if(arr[mid+k]-x<x-arr[mid]){
                    lo=mid+1;
                }
                else{
                    hi=mid;
                }
            }
            List<Integer> ans=new ArrayList<>();
            for(int i=lo;i<lo+k;i++){
                ans.add(arr[i]);
            }
            return ans;
        }
}
//Try it using lambda functions as well

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna