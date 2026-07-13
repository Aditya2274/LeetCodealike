class Solution {
    public List<String> powerSet(String s) {
        List<String> ans=new ArrayList<>();
        helper(0,new StringBuilder(),s,ans);
        Collections.sort(ans);
        return ans;
    }
    public void helper(int idx,StringBuilder curr,String s, List<String> ans){
        if(idx==s.length()){
            ans.add(curr.toString());
            return;
        }
        curr.append(s.charAt(idx));
        helper(idx+1,curr,s,ans);
        curr.deleteCharAt(curr.length()-1);
        helper(idx+1,curr,s,ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna