class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                int no_zero=0;
                int no_one=0;
            for(int j=i;j<s.length();j++){
                if(no_one>0 && s.charAt(j)=='0'){
                    i=j-1;
                    break;
                }
                if(s.charAt(j)=='0'){
                    no_zero++;
                }
                if(s.charAt(j)=='1'){
                    no_one++;
                }
            }
            if(no_zero==no_one){
                ans=Math.max(ans,no_zero*2);
            }
            else{
                if(no_zero<no_one)
                    ans=Math.max(ans,no_zero*2);
                else
                    ans=Math.max(ans,no_one*2);
            }
            }
        }
        return ans;
    }
}