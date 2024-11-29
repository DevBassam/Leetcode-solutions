import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            List<Integer> sublist = list.subList(i+1,list.size());
            if (sublist.contains(target - current)) {
                result[0] = list.indexOf(current);
                result[1] = sublist.indexOf(target - current)+i+1;
            }
        }
        return result;
    }
}
