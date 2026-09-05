class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        combo(1,k,n,ans,ds);
        return ans;
    }
    static void combo(int start,int k,int n,List<List<Integer>> ans,List<Integer> ds){
        if(n==0&& k==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(n<0 || k<0){
            return;
        }
            for(int j=start;j<=9;j++){
                ds.add(j);
                combo(j+1,k-1,n-j,ans,ds);
                ds.remove(ds.size()-1);
            }

        }
 }
