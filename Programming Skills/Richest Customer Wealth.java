class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int current;
        for(int i = 0; i < accounts.length; i++){
            current = Arrays.stream(accounts[i]).sum();
            if(max < current) max = current;
        }
        return max;
    }
}
