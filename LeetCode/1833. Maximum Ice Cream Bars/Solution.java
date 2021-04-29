class Solution {
    // Time Complexity: O(nlogn) most likely because of the sort
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);
        
        int i = 0;
        while(i < costs.length && costs[i] <= coins) {
            coins -= costs[i];
            i++;
        }
        
        return i;
    }
}
