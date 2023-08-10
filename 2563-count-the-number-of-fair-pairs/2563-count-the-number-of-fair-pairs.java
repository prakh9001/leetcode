class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans = 0;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(Integer.MIN_VALUE, -1);

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int minAdd = lower - x;
            int maxAdd = upper - x;
            
            int left = treeMap.floorEntry(minAdd-1).getValue();
            int right = treeMap.floorEntry(maxAdd).getValue();
            ans += right-left;

            treeMap.put(x, i);
        }
        
        return ans;
    }
}