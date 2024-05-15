package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 백준_11724 {

	static int N; // 노드 개수
	static int M; // 간선 개수
	
	static ArrayList<Integer>[] A; //인접 리스트
	static boolean[] visited; //방문 배열
	
	static int cnt; //연결 요소 개수
	
	static void dfs(int num) {
		visited[num] = true;
		
		for(int i : A[num]) {
			if(!visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		
		for(int i=1; i<=N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			A[s].add(e); //간선 연결(방향 없는 그래프)
			A[e].add(s); //간선 연결(방향 없는 그래프)
		}
		
		cnt = 0;
		
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				cnt++;
				dfs(i);
			}
		}
		
		System.out.println(cnt);
		
	}

}
