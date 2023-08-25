class Solution {
    public int dominantIndex(int[] nums) {
        int maxnum = nums[0];
        int maxindex = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if (nums[i] > maxnum) {
                maxnum = nums[i];
                maxindex = i;
            }
        }
        for(int i = 0 ; i < nums.length; i++) {
            if (nums[i] * 2 > maxnum && i != maxindex) {
                return -1;
            }
        }
        return maxindex;
    }
}