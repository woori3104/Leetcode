class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m; i<nums1.length; i++) {
            nums1[i]=nums2[nums1.length-i-1];
        }
        Arrays.sort(nums1);
    }
}