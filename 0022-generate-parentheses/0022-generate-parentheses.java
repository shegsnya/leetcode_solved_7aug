class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        gp(0,0,ans,"",n);
        return ans;
    }
    static void gp(int open, int close,ArrayList<String> ans,String p,int n){
        if(open==n &&close==n ){
            ans.add(p);
            return;
        }
        if(close<open){
            gp(open,close+1,ans,p+')',n);
        }
        if(open<n){
            gp(open+1,close,ans,p+'(',n);
        }
    }
}