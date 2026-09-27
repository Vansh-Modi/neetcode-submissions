class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int init = nums[0], count = 1, sequence = 1;
        if (nums.length == 2) {
            if (nums[0] + 1 == nums[1]) {
                sequence++;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int num = init + count;
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            }
            System.out.println(nums[i]);
            if (nums[i] + 1 != nums[i + 1]) {
                if (sequence < count) {
                    sequence = count;
                }
                count = 1;
            }
        }
        if (sequence < count)
            return count;
        return sequence;
    }
}