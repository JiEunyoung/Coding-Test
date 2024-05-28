package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����_1890 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //������ ����, ����
		
		int[][] game = new int[N][N];
		long[][] dp = new long[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<N; j++) {
				game[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0][0] = 1;
		
		long cnt = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i == N - 1 && j == N - 1) {
					cnt = dp[N - 1][N - 1];
				}
				if(i + game[i][j] < N) { //�Ʒ��� �̵�
					dp[i + game[i][j]][j] += dp[i][j];
				}
				if(j + game[i][j] < N) { //������ �̵�
					dp[i][j + game[i][j]] += dp[i][j];
				}
			}
		}
		
		System.out.println(cnt);
	}
}
