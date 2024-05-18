package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ����_2178 {
	
	static int N; //�̷� ����
	static int M; //�̷� ����
	
	static int[][] maze;
	static boolean[][] visited;
	
	static int[] dx = {1, -1, 0, 0}; //������, ���� �̵�
	static int[] dy = {0, 0, 1, -1}; //����, �Ʒ��� �̵�
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			visited[x][y] = true;
			
			for(int i=0; i<4; i++) {
				int newX = now[0] + dx[i];
				int newY = now[1] + dy[i];
				
				if(newX >= 0 && newX < N && newY >= 0 && newY < M) {
					if(maze[newX][newY] == 1 && !visited[newX][newY]) { //�湮���� ���� ���� ���
						visited[newX][newY] = true; //�湮 ��� true ǥ��
						maze[newX][newY] = maze[now[0]][now[1]] + 1; //�湮�� ���� +1 
						queue.add(new int[] {newX, newY});
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		maze = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			for(int j=0; j<M; j++) {
				maze[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
			}
		}
		
		bfs(0, 0);
		System.out.println(maze[N-1][M-1]);
	}
}
