class Solution {
    public void moveZeroes(int[] nums) {
        int trackIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[trackIndex] = nums[i];
                trackIndex++;
            }
        }
        for(int i = trackIndex; i < nums.length;i++){
            nums[i] = 0;
        }
    }
}
