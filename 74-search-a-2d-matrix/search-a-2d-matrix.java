class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int end=(n*m)-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return false;//revisited again
    }
}