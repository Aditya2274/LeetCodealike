class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                    st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if((ch==')'&&st.peek()=='(')||(ch==']'&&st.peek()=='[')||(ch=='}'&&st.peek()=='{')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna