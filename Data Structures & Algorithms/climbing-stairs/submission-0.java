class Solution {
    int[] ways;
    public int climbStairs(int n) {
        ways = new int[n+1];
        Arrays.fill(ways, -1);
        return dp(ways, n);
    }
    public int dp(int[] ways, int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        return dp(ways, n-1) + dp(ways, n-2);
    }
}
