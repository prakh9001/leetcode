class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String m = "";
        String arr[] = new String[words.size()];
        for(int i=0;i<words.size();i++){
            arr[i] = words.get(i);
        }
        for(int i=0;i<arr.length;i++){
            m+=arr[i].charAt(0);
        }
        if(m.equals(s)){
            return true;
        }
        return false;
    }
}