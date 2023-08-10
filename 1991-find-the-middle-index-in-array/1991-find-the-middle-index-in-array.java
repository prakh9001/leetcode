class Solution {
    public int findMiddleIndex(int[] nums) {
        int x=-1;
        for(int i=0;i<nums.length;i++){
            int a=0, b=0;
            for(int j=0;j<nums.length;j++){
                if(i>j){
                    a+=nums[j];
                }
                else if(i<j){
                    b+=nums[j];
                }
            }
            if(a==b){
                x=i;
                break;
            }
        }
        return x;
    }
}