class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int left = i * nums[i] - prefix[i];
            int right = (prefix[n] - prefix[i + 1])
                      - (n - i - 1) * nums[i];
            result[i] = left + right;
        }
        return result;
    }
}