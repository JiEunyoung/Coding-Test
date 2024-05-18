package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 백준_1697 {
	
	static int[] time = new int[100001];
	
	static int N; //수빈 위치
	static int K; //동생 위치
	
	public static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(n);
		time[n] = 0;
		
		while(!queue.isEmpty()) {
	
			int x = queue.poll();
			
			if(x == K) {
				return; //메소드 종료
			}
			
			if(x-1 >= 0 && time[x-1] == 0) { //방문하지 않은 곳인 경우
				time[x-1] = time[x] + 1; //1초 증가
				queue.add(x-1);
			}
			
			if(x+1 <= 100000 && time[x+1] == 0) { //방문하지 않은 곳인 경우
				time[x+1] = time[x] + 1; //1초 증가
				queue.add(x+1);
			}
			
			if(x*2 <= 100000 && time[2*x] == 0) { //방문하지 않은 곳인 경우
				time[2*x] = time[x] + 1; //1초 증가
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
