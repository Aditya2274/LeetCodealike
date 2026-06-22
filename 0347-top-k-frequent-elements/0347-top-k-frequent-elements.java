class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int ele: map.keySet()){
            int fre=map.get(ele);
            pq.add(new Pair(ele,fre));
            if(pq.size()>k) pq.poll();
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            Pair p=pq.poll();
            ans[i]=p.ele;
        }
        return ans;
    }
    class Pair implements Comparable<Pair>{
        int ele;
        int fre;
        Pair(int ele,int fre){
            this.ele=ele;
            this.fre=fre;
        }
        public int compareTo(Pair other){
            return this.fre-other.fre;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna