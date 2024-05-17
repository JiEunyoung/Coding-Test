package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class น้มุ_1697 {
	
	static int[] time = new int[100001];
	
	static int N;
	static int K;
	
	public static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(n);
		time[n] = 0;
		
		while(!queue.isEmpty()) {
	
			int x = queue.poll();
			
			if(x == K) {
				return;
			}
			
			if(x-1 > 0 && time[x-1] == 0) {
				time[x-1] = time[x] + 1;
				queue.add(x-1);
			}
			
			if(x+1 < 100001 && time[x+1] == 0) {
				time[x+1] = time[x] + 1;
				queue.add(x+1);
			}
			
			if(x*2 < 100001 && time[2*x] == 0) {
				time[2*x] = time[x] + 1;
				queue.add(2*x);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		bfs(N);
		System.out.println(time[K]);
	}

}
