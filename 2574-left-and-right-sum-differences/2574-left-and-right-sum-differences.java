class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[] = new int[nums.length];
         for (int i = 0 ; i < nums.length; i++){
           int left = 0 ;
            int right = 0 ;
             for(int j = 0 ; j<nums.length; j++){
              if(i<j){
                  right+=nums[j];
              }
                 else if(i>j){
                     left+=nums[j];
                 }
                 
            }
            
                 arr[i] = Math.abs(left-right);
            
        }
        return arr ;
    }
}