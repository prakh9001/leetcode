class Solution {
    public String longestCommonPrefix(String[] strs) {
        String one = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(one)!=0){
                one = one.substring(0, one.length()-1);
            }
        }
        return one;
    }
}