class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int maxlen=0;int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            maxlen=Math.max(maxlen,right-left+1);
            map.put(ch,right);
        }
        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna