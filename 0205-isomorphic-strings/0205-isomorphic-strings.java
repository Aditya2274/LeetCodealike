class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] mapt=new int[256];
        int[] maps=new int[256];
        for(int i=0;i<s.length();i++){
           char chart=t.charAt(i);
           char chars=s.charAt(i);
            if(maps[chars]!=mapt[chart]) return false;
            maps[chars]=i+1;
            mapt[chart]=i+1;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna