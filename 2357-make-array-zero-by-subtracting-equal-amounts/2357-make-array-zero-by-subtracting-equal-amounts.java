class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int x = nums[i];
                c++;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]!=0){
                        nums[j]-=x;
                    }
                }
            }
        }
        return c;
    }
}