class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: stones){
            pq.add(ele);
        }
        while(pq.size()>1) {
                int x=pq.poll();
                int y=pq.poll();
                if(x!=y) pq.add(x-y);
        }
        if(pq.size()==1) return pq.poll();
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna