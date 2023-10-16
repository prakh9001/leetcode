class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+1];
        for(int i = 0 ; i<n; i++){
            arr[nums[i]]=1; 
        }
        for(int i = 0; i<=n; i++){
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }
}