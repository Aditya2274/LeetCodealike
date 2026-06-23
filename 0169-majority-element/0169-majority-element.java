class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele: nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int max=0;int element=0;
        for(int ele: map.keySet()){
            if(map.get(ele)>max){
                max=map.get(ele);
                element = ele;
            }
        }
        return element;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna