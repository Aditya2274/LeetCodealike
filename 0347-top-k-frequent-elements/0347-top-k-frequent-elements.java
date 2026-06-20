class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int ele: map.keySet()){
            int fre=map.get(ele);
            pq.add(new Pair(ele,fre));
            if(pq.size()>k) pq.poll();
        }
        for(int i=0;i<k;i++){
            Pair p=pq.poll();
            ans[i]=p.ele;
        }
        return ans;
    }
    class Pair implements Comparable<Pair>{
        int ele,freq;
        Pair(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair other){
            return this.freq-other.freq;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna