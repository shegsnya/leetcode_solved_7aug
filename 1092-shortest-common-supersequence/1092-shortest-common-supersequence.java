class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        String st="";
        int m=str1.length();
        int n=str2.length();
        int[][]t=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                t[i][j]=0;
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int i=str1.length();
        int j=str2.length();
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                st+=str1.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(t[i-1][j]<t[i][j-1]){
                    st+=str2.charAt(j-1);
                    j--;
                }
                else{
                    st+=str1.charAt(i-1);

                    i--;
                }

            }
        }
        while(i>0){
            st+=str1.charAt(i-1);
            i--;
        }
        while(j>0){
            st+=str2.charAt(j-1);
            j--;
        }
        return reverse(st);
        ///StringBuilder sb=new StringBuilder(st);
    //return sb.reverse().toString();
    }
    static String reverse(String st){
        if(st.length() == 0){
            return st;
            }
            return reverse(st.substring(1)) + st.charAt(0);
    }
}