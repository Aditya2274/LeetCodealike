class Solution {
    class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d,int x,int y){
            this.d=d;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Triplet t){
            return this.d-t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int x=points[i][0];int y=points[i][1];
            int d=x*x+y*y;
            Triplet pair=new Triplet(d,x,y);
            pq.add(pair);
            if(pq.size()>k)pq.poll();
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            Triplet t=pq.poll();
            ans[i][0]=t.x;
            ans[i][1]=t.y;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna