class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;   // minimum ke liye badi value

        while (right < n) {
            sum = sum + nums[right];

            while (sum >= target) {
                int currLen = right - left + 1;
                ans = Math.min(ans, currLen);   // correct minimum logic
                sum = sum - nums[left];
                left++;
            }
            right++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans; // question requirement
    }
}
