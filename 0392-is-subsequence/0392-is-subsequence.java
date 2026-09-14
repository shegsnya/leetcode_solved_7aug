class Solution {
    public boolean isSubsequence(String s, String t) {
        //dp approach
        int m=s.length();
        int n=t.length();
        int[][]ta=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                ta[i][j]=0;
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    ta[i][j]=1+ta[i-1][j-1];
                }
                else{
                    ta[i][j]=Math.max(ta[i-1][j],ta[i][j-1]);
                }
            }
        }
    if(ta[m][n]==s.length()){
        return true;
    }
    return false;}
}