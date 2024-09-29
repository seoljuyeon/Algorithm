package soli.PGS2.ch8_dp;

public class PGS41_등굣길 {
    public static int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;
        int[][] dp = new int[n+1][m+1];

        for(int[] puddle : puddles) {
            dp[puddle[1]][puddle[0]] = -1;
        }

        // 집
        dp[1][1] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(dp[i][j] == -1) {
                    // 웅덩이 경로 0개 기록
                    dp[i][j] = 0;
                    continue;
                }

                if(i > 1) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j]) % mod;
                }
                if(j > 1) {
                    dp[i][j] = (dp[i][j] + dp[i][j-1]) % mod;
                }
            }
        }

        return dp[n][m] % mod;
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 3, new int[][]{{2, 2}})); // 4
    }
}
