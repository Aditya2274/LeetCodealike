class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;int c=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(i,vis,isConnected);
                c++;
            }
        }
        return c;
    }
    public void bfs(int j,boolean vis[],int[][] adj){
        vis[j]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(j);
        while(q.size()>0){
            int front=q.poll();
            for(int i=0;i<adj[0].length;i++){
                if(adj[front][i]==1 && vis[i]==false){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna