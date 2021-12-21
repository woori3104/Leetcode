class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if (target < nums[0])
            return 0;
        if (target > nums[nums.length-1])
            return nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) right = mid -1;
            else left = mid + 1;
        }
        return left;
    }
}