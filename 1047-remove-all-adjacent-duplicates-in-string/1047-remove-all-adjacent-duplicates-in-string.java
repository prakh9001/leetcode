class Solution {
    StringBuilder st = new StringBuilder();
    public String removeDuplicates(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            if (st.length() > 0 && st.charAt(st.length() - 1) == s.charAt(i)) {
                st.deleteCharAt(st.length() - 1);
            } else {
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}