class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        pali(0,s,ds,ans);
        return ans;
    }
    static void pali(int index,String s,List<String> ds,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =index;i<s.length();i++){
            if(isplaindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                pali(i+1,s,ds,ans);
                ds.remove(ds.size()-1);

            }
        }
    }
    static boolean isplaindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
    return true;
    }
}