class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashSet<Character> list = new HashSet<>();
        for (char c : ransomNote.toCharArray())
            list.add(c);
        
       for (Character c : list)
       {
           int count1 = countChar(ransomNote , c);
           int count2 = countChar(magazine , c);
            if (count1 > count2)
                return false;
       }
        return true;
    }
    public static int countChar(String str , char c)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}