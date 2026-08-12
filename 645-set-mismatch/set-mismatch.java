class Solution {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }

        }
        for(int j=0;j<nums.length;j++){
            if (j!=nums[j]-1){
                return new int[]{nums[j],j+1};
            }}
        return new int[]{-1,-1};
        }
        static void swap(int[] nums,int i,int correct){
            int temp=nums[i];
            nums[i]=nums[correct];
            nums[correct]=temp;
        }
}    
