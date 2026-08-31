class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        findcom2(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    static void findcom2(int index,int target,int[] candidates,List<List<Integer>> ans,List<Integer> ds){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                 return;
            }
      
       for(int i =index;i<candidates.length;i++){
        if(i>index && candidates[i]==candidates[i-1]){ // we should alwasy consider 1st elemetn after that index still 0 i increases so were comparing adn checking 2nd 3rd etc duplicate values 
            continue;
        }
        if(candidates[i]>target){
            break;
        }
        ds.add(candidates[i]);
        findcom2(i+1,target-candidates[i],candidates,ans,ds);
        ds.remove(ds.size()-1);    
    }
}
    }