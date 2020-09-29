class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int j = 0; j < length; j++) {
            int num = nums[j];
            for(int i = 0; i < length; i++) {
                if (num == nums[i]) {
                }
                else if (num + nums[i] == target) {
                    int[] pair = {j, i};
                    return pair;
                }
                else {
                }
            }
        }
        return nums;
    }
}

