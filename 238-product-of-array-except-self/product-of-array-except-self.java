class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=1;
        int[] suffix=new int[nums.length];
        suffix[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            suffix[j]=suffix[j+1]*nums[j+1];
        }
        int[] arr=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i]=prefix[i]*suffix[i];
        }
    return arr;}
}