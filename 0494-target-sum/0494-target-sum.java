class Solution {
    public int findTargetSumWays(int[] nums, int target) {
            int sumwhole=0;
            for(int i =0;i<nums.length;i++){
                 sumwhole+=nums[i];
    }
    if (target > sumwhole || (sumwhole + target) % 2 != 0) {
    return 0;
    }
    int targetsum=(sumwhole+Math.abs(target))/2;
    
    return perfectsum(nums,targetsum);
    }
    static int perfectsum(int[] arr, int target) {
        // code here
       
        int[][] t=new int[arr.length+1][target+1];
               t[0][0]=1;
               for(int i=1;i<=arr.length;i++){
                 if(arr[i-1]==0){
                     t[i][0]=2*t[i-1][0];
                 }
                 else{
                     t[i][0]=t[i-1][0];
                 }
               }
                for(int i=1;i<arr.length+1;i++){
                   for(int j=1;j<target+1;j++){
                       if(arr[i-1]<=j){
                           t[i][j]=t[i-1][j]+t[i-1][j-arr[i-1]];
                       }
                       else{
                           t[i][j]=t[i-1][j];
                       }
                   }
               }
           return t[arr.length][target];
    }
}