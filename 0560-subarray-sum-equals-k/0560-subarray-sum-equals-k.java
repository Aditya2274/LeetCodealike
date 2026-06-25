class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixsum=0,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num: nums){
            prefixsum += num;
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna