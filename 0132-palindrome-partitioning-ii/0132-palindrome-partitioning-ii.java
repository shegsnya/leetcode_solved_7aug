class Solution {
    public int minCut(String s) {
        int n = s.length();

        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        boolean[][] pal = new boolean[n][n];

        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 1 || pal[i + 1][j - 1])) {
                    pal[i][j] = true;
                }
            }
        }

        return solve(s, 0, n - 1, dp, pal);
    }

    static int solve(String s, int i, int j,
                     int[][] dp, boolean[][] pal) {

        if (i >= j || pal[i][j]) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int mn = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {

            if (pal[i][k]) {

                int temp = 1 + solve(s, k + 1, j, dp, pal);

                mn = Math.min(mn, temp);
            }
        }

        return dp[i][j] = mn;
    }
}