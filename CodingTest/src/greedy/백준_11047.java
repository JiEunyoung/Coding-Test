package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //동전 종류 개수
		int K = Integer.parseInt(st.nextToken()); 
		
		int[] coins = new int[N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			coins[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0; //필요한 동전 개수
		
		for(int i=N-1; i>=0; i--) {
			if(coins[i] <= K) {
				cnt += K / coins[i];
				K = K % coins[i];
			}
		}
		
		System.out.println(cnt);
		
		

	}

}
