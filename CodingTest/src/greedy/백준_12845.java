package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class น้มุ_12845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] level = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			level[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(level);
		
		int coin = 0;
		
		for(int i=N-2; i>=0; i--) {
			coin += level[N-1] + level[i];
		}
		
		System.out.println(coin);

	}

}
