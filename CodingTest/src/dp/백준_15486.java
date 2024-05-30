package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class น้มุ_15486 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] T = new int[N + 1];
		int[] P = new int[N + 1];
		
		int[] dp = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=N; i++) {
			int t = T[i];
			int p = P[i];
			
			if(i + t - 1 <= N) {
				dp[i + t - 1] = Math.max(dp[i + t - 1], dp[i - 1] + p);
			}
			
			dp[i] = Math.max(dp[i], dp[i - 1]);
		}
		
		System.out.println(dp[N]);
	}

}
