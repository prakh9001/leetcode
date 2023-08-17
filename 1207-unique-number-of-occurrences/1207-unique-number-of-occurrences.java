class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            for(Map.Entry<Integer,Integer> n : mp.entrySet()){
                if(e.getValue()==n.getValue() && e!=n){
                    return false;
                }
            }
        }
        
        return true;
    }
}