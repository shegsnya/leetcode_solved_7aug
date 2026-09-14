class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder s2=new StringBuilder(s);
        String str=s2.reverse().toString();
        int m=s.length();
                int n=str.length();
                int[][]t=new int[m+1][n+1];
                for(int i=0;i<m+1;i++){
                    for(int j=0;j<n+1;j++){
                        t[i][j]=0;
                    }
                }
                for(int i=1;i<m+1;i++){
                    for(int j=1;j<n+1;j++){
                        if(s.charAt(i-1)==str.charAt(j-1)){
                            t[i][j]=1+t[i-1][j-1];
                        }
                        else{
                            t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                        }
                    }
                }
        
    return t[m][n];
    }
}