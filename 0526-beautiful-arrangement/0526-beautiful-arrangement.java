
class Solution {
    int count = 0;

    public int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];

        solve(1, n, visited);

        return count;
    }

    public void solve(int pos, int n, boolean[] visited) {

        if (pos > n) {
            count++;
            return;
        }

        for (int num = 1; num <= n; num++) {

            if (!visited[num] &&
                (num % pos == 0 || pos % num == 0)) {

                visited[num] = true;

                solve(pos + 1, n, visited);

                visited[num] = false;
            }
        }
    }
}
