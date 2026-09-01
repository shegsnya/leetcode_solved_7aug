class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] arr=new boolean[nums.length];
        List<Integer> ds=new ArrayList<>();
        permutation(nums,arr,ans,ds);
        return ans;
    }
    static void permutation(int[]nums,boolean[]arr,List<List<Integer>> ans,List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                arr[i]=true;
                ds.add(nums[i]);
                permutation(nums,arr,ans,ds);
                ds.remove(ds.size()-1);
                arr[i]=false;
            
            }
        }
    }
}