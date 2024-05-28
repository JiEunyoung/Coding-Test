package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1495 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //곡 개수
		int S = Integer.parseInt(st.nextToken()); //시작 볼륨
		int M = Integer.parseInt(st.nextToken()); //가능한 최대 볼륨
		
		int[] V = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			V[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean[][] dp = new boolean[N + 1][M + 1];
		// N+1: 시작 볼륨부터 곡을 연주하고 난 뒤의 값 저장
		// M+1: 0부터 M까지의 볼륨 저장
		
		dp[0][S] = true;
		
		for(int i=1; i<=N; i++) {
			for(int j=0; i<=M; j++) {
				if(dp[i - 1][j]) {
					if(j + V[i - 1] <= M) {
						dp[i][j + V[i - 1]] = true;
					}
					if(j - V[i - 1] >= 0) {
						dp[i][j - V[i - 1]] = true;
					}
				}
			}
		}
		
		int maxV = -1;
		for(int i=0; i <= M; i++) {
			if(dp[N][i]) {
				maxV = i;
			}
		}
		
		System.out.println(maxV);

	}

}
