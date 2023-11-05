class Solution {

    static List<String> ans;

    static void helper(int open, int close ,String s){

        if(open==0 && close==0) ans.add(s);

        if(open>0) helper(open-1,close+1,s+"(");
        if(close>0) helper(open,close-1,s+")");
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        helper(n,0,"");
        return ans;
    }
}