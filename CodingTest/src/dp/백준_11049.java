package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����_11049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[N][N];
		int[][] size = new int[N][2]; //����� ��, �� ũ�� ����
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			size[i][0] = Integer.parseInt(st.nextToken()); //��
			size[i][1] = Integer.parseInt(st.nextToken()); //��
		}
		
		for(int k = 1; k < N; k++) { //�κ� ��� ����
			for(int i = 0; i + k < N; i++) { //�κ� ����� ���� �ε���
				dp[i][i + k] = Integer.MAX_VALUE;
				
				for(int j = i; j < i + k; j++) {
					dp[i][i + k] = Math.min(dp[i][i + k], dp[i][j] + dp[j + 1][i + k] + size[i][0] * size[j][1] * size[i + k][1]);
				}
			}
		}
		
		System.out.println(dp[0][N - 1]);

	}

}
