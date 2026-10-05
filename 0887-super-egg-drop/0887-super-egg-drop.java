class Solution {
    public int superEggDrop(int k, int n) {
        int[][] dp = new int[k + 1][n + 1];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        return solve(k, n, dp);
    }

    static int solve(int n, int f,int[][]dp) {
        if (f == 0 || f == 1)
            return f;
        if (n == 1)
            return f;
        if (dp[n][f] != -1)
            return dp[n][f];
        else {
            int mn = Integer.MAX_VALUE;
            int l = 1;
            int h = f;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                int low = solve(n - 1, mid - 1,dp);
                int high = solve(n, f - mid,dp);
                int temp = 1 + Math.max(low, high);
                mn = Math.min(mn, temp);
                if (low > high) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return dp[n][f]=mn;
        }
    }
}