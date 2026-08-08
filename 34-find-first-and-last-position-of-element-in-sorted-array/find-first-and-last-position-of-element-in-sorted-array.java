class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer={-1,-1};
        ceiling(nums,target,answer);
        floor(nums,target,answer);
    return answer;} 
    static void ceiling(int[]nums,int target,int[] answer){
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
                answer[0]=mid;
                end=mid-1;
            }
            }
          }
    static void floor(int[] nums,int target,int[] answer){
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
                    answer[1]=mid;
                    start=mid+1;

                }
        }//think bbg
        
        }
    

}
   

   
