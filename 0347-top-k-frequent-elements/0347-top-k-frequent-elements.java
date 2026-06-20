class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>[] arr=new ArrayList[nums.length+1];
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele: map.keySet()){
            int fre=map.get(ele);
            if(arr[fre]==null){
                arr[fre]=new ArrayList<>();
            }
            arr[fre].add(ele);
        }
        int c=0;int[] ans=new int[k];
        for(int i=arr.length-1;i>=0 && c<k;i--){
            if(arr[i]!=null){
                for(int val: arr[i]){
                    ans[c++]=val;
                    if(c==k) break;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna