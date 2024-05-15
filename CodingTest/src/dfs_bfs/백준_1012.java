package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����_1012 {
	static int[][] map;
	static boolean[][] visited;
	static int M;
	static int N;
	static int K;
	
	static int cnt;
	
	static int[] dx = {1, -1, 0, 0}; //������, ���� �̵�
	static int[] dy = {0, 0, 1, -1}; //����, �Ʒ��� �̵�
	
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
		int T = Integer.parseInt(br.readLine()); //�׽�Ʈ ���̽� ����
		
		for(int t=0; t<T; t++) {
			cnt = 0; //�׽�Ʈ ���̽����� �ʱ�ȭ
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			M = Integer.parseInt(st.nextToken()); //���߹� ���� ����
			N = Integer.parseInt(st.nextToken()); //���߹� ���� ����
			K = Integer.parseInt(st.nextToken()); //���� ����
			
			map = new int[M][N];
			visited = new boolean[M][N];
			
			for(int k=0; k<K; k++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken()); //���߹� ���� ����
				int y = Integer.parseInt(st.nextToken()); //���߹� ���� ����
				
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
