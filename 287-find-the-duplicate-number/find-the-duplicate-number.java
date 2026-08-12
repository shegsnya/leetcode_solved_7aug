class Solution {
    public int findDuplicate(int[] nums) {
         int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=i+1){
                if(nums[i]==nums[correct]){
                    return nums[i];
                }
                swap(nums,i,correct);
            }
            else{
                i++;
            }
    }
return 1;}
static void swap(int[]nums,int i ,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}
