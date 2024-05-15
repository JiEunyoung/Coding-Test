package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1012 {
	static int[][] map;
	static boolean[][] visited;
	static int M;
	static int N;
	static int K;
	
	static int cnt;
	
	static int[] dx = {1, -1, 0, 0}; //오른쪽, 왼쪽 이동
	static int[] dy = {0, 0, 1, -1}; //위쪽, 아래쪽 이동
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(newX >=0 && newX < M && newY >= 0 && newY < N && !visited[newX][newY] && map[newX][newY] == 1) {
				dfs(newX, newY);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //테스트 케이스 개수
		
		for(int t=0; t<T; t++) {
			cnt = 0; //테스트 케이스마다 초기화
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			M = Integer.parseInt(st.nextToken()); //배추밭 가로 길이
			N = Integer.parseInt(st.nextToken()); //배추밭 세로 길이
			K = Integer.parseInt(st.nextToken()); //배추 개수
			
			map = new int[M][N];
			visited = new boolean[M][N];
			
			for(int k=0; k<K; k++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken()); //배추밭 가로 길이
				int y = Integer.parseInt(st.nextToken()); //배추밭 세로 길이
				
				map[x][y] = 1;
			}
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j] == 1 && !visited[i][j]) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
		
	}

}
