class Solution {
    // Time Complexity O(n*m), Space Complexity O(n)
    public int maximumWealth(int[][] accounts) {
        int wealths[] = new int[accounts.length];
        
        for(int i = 0; i < accounts.length; ++i) {
            int wealth = 0;
            for(int k = 0; k < accounts[i].length; ++k) {
                wealth += accounts[i][k];
            }
            
            wealths[i] = wealth;
        }
        
        int max_wealth = 0;
        for(int i = 0; i < wealths.length; ++i) {
            if(wealths[i] > max_wealth) {
                max_wealth = wealths[i];
            }
        }
        
        return max_wealth;
    }
}
