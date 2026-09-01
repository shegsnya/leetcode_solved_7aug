class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        subsettwo(0,nums,ans,new ArrayList<>());
        return ans;
    }
    static void subsettwo(int index,int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<=nums.length-1;i++){
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            subsettwo(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);

        }

    }
}