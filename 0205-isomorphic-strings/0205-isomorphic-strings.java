class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map=new HashMap<>();
        HashSet<Character> mappedvalue=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char chars=s.charAt(i);
            char chart=t.charAt(i);
            if(map.containsKey(chars)){
                if(map.get(chars)!=chart) return false;
            }
            else{
                if(mappedvalue.contains(chart)) return false;
                map.put(chars,chart);
                mappedvalue.add(chart);
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna