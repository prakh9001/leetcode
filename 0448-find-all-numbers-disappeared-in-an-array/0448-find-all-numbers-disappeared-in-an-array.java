class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        for(int i=1;i<nums.length+1;i++){
            if(!mp.containsKey(i)){
                li.add(i);
            }
        }
        return li;
    }
}