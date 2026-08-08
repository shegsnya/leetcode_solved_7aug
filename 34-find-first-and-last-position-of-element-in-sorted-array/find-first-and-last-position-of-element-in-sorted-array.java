class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ceiling(nums,target,ans);
        floor(nums,target,ans);
    return ans;} 
    static void ceiling(int[]nums,int target,int[] ans){
         int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target>nums[mid]) {
                start = mid + 1;
            }
            else{
                ans[0]=mid;
                end=mid-1;
            }
            }
          }
    static void floor(int[] nums,int target,int[] ans){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if(target>nums[mid]) {
                start = mid + 1;}
            else{
                    ans[1]=mid;
                    start=mid+1;

                }
        }//think bbg
        
        }
    

}
   

   
