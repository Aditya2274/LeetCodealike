class Solution {
    class Pair implements Comparable<Pair>{
        int n;
        int diff;
        Pair(int n,int diff){
            this.n=n;
            this.diff=diff;
        }
        public int compareTo(Pair other){
            if(other.diff!=diff){
                return diff-other.diff;
            }
            else{
                return n-other.n;
            }
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            if(pq.size()>k) pq.poll();
        }
        List<Integer> arr1=new ArrayList<>();
        for(int i=0;i<k;i++){
            arr1.add(pq.poll().n);
        }
        Collections.sort(arr1);
        return arr1;
    }
}








// this.value - other.value → ascending order → PriorityQueue acts as a min-heap.
// other.value - this.value → descending order → PriorityQueue acts as a max-heap.

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna