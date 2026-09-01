class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //method 2-swap
        List<List<Integer>> ans=new ArrayList<>();
        permutation(nums,ans,0);
        return ans;
    }
    static void permutation(int[]nums,List<List<Integer>> ans,int index){
        List<Integer> ds=new ArrayList<>();
        if(index==nums.length){
            for(int i =0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            permutation(nums,ans,index+1);
            swap(nums,index,i);

        }
    }
    static void swap(int[]nums,int index,int i){
        int temp=nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
    }
}