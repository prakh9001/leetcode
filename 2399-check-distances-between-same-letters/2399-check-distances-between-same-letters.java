class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int index = hm.get(s.charAt(i));
                int gap = i-index-1;
                if(distance[s.charAt(i)-'a'] != gap){
                    return false;
                }
            }else{
                hm.put(s.charAt(i),i);
            }
        }
        return true;
    }
}