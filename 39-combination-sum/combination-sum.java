class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findcombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    static void findcombination(int index,int[]candidates,int target,List<List<Integer>> ans,List<Integer>ds){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            
       return; }
        //pick condition
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            findcombination(index,candidates,target-candidates[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        //move one dont pick current
        findcombination(index+1,candidates,target,ans,ds);
        

    }
}