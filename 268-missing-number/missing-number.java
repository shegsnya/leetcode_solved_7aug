class Solution {
    public int missingNumber(int[] nums) {
        //BITWISE
        int n=nums.length;
        int xr=0;
        int xxr=n;
        for(int i =0;i<n;i++){
             xr ^=nums[i];
              xxr ^=i;
        }
       
    return xr^xxr; }
}