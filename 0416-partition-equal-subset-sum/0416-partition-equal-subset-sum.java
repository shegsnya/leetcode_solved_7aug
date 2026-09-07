class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            return(isSubsetSum(nums,sum/2));
        }
        
    }
    static boolean isSubsetSum(int arr[], int sum) {
            // code here
            boolean[][] t=new boolean[arr.length+1][sum+1];
            t[0][0]=true;
            for(int i=1;i<arr.length+1;i++){
                t[i][0]=true;
            }
             for(int i=1;i<arr.length+1;i++){
                for(int j=1;j<sum+1;j++){
                    if(arr[i-1]<=j){
                        t[i][j]=t[i-1][j]||t[i-1][j-arr[i-1]];
                    }
                    else{
                        t[i][j]=t[i-1][j];

                    }
                }
            }
        return t[arr.length][sum];
        
    }
}