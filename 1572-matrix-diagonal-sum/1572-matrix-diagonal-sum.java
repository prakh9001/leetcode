class Solution {
    public int diagonalSum(int[][] mat) {
        int count=0,n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || n-i-1==j){
                    count+=mat[i][j];
                }
            }
        }
        return count;
    }
}