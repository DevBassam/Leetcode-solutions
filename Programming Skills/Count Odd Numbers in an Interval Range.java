class Solution {
    public int countOdds(int low, int high) {
        int result = (high-low)/2;
        return (low % 2 != 0 || high % 2 != 0) ? ++result: result;
    }
}
