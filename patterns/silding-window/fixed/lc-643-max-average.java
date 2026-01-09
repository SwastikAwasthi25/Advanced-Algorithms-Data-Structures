class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAvg = (double) sum / k;

        // slide the window
        for (int i = k; i < n; i++) {
            sum += nums[i];        //add new element
            sum -= nums[i - k];    //remove old element
            maxAvg = Math.max(maxAvg, (double) sum / k);
        }
       return maxAvg;
    }
}
