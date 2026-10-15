class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n - 1) {
            return -1;
        }

        int[] trustScores = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            trustScores[trust[i][0]]--;
            trustScores[trust[i][1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}