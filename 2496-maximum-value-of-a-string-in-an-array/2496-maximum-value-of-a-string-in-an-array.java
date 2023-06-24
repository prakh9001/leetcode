class Solution {
    public int maximumValue(String[] strs) {
         int max_len = 0;
        for(String word : strs)
            max_len = Math.max(max_len, isNumeric(word) ? Integer.valueOf(word) : word.length());
        return max_len;
    }
    private boolean isNumeric(String str){
        for(char c : str.toCharArray())
            if(Character.isLetter(c))  return false;
        return true;
    }
}