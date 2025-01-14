/*Time Complexity : O(MN)
Space Compelxity : 
Did it run on LeetCode : Yes
Any problems?

Dynamic Programming Solution.
*/

class Solution {
    public int uniquePaths(int m, int n) {
      int [][] dp = new int[m][n];
        
        if(m==0) return 0;
        
        for(int i = 0; i<m;i++){
            dp[i][0] = 1; // Make the first row as 1.
        }
        for(int j= 0;j<n;j++){
            dp[0][j]=1;     // Make the first column as 1.
        }
        
        
        for(int i = 1;i<m;i++)
        {
            for(int j = 1;j<n;j++)
            {
                dp[i][j] = dp[i-1][j]+dp[i][j-1]; // Update the dp array : add the value one above and one to the left. After all iterations are over, the result is stored in the last grid.
            }
        }
        
        
        return dp[m-1][n-1];
    }
}
