class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
    List<Integer> ls=new ArrayList<>();
    for(int j =0;j<nums.length;j++){
        if(nums[j]!=j+1){
            ls.add(nums[j]);
        }
    }
   return ls; }
    static void swap(int[]nums,int i ,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}