class Solution {
  private final String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans=new ArrayList<>();
        helper(digits,"",ans);
        return ans;
    }
     void helper(String up,String p,ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return ;
        }
        String digit=map[up.charAt(0)-'0'];
        for(int i =0;i<digit.length();i++){
            helper(up.substring(1),p+digit.charAt(i),ans);
        }
    }


}