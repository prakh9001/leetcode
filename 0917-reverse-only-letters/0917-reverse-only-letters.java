class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }
        str.reverse();
        for(int i=0;i<s.length();i++){
            if(!Character.isAlphabetic(s.charAt(i))){
                str.insert(i,s.charAt(i));
            }
        }
        return str.toString();
    }
}