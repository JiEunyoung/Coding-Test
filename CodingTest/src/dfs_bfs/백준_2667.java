package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class 백준_2667 {
	static int N; //지도의 크키(정사각형 한 변의 길이)
	
	static boolean[][] map; 
	static boolean[][] visited; //방문 배열
	
	static int countHouse; //집 개수
	
	static int[] dx = {1, -1, 0, 0}; //오른쪽 왼쪽 이동
	static int[] dy = {0, 0, 1, -1}; //위쪽 아래쪽 이동
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		countHouse++;
		
		for(int i=0; i<4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(newX >= 0 && newX < N && newY >= 0 && newY < N && !visited[newX][newY] && map[newX][newY]) {
				dfs(newX, newY);
			}
		}
		

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); //지도의 크키(정사각형 한 변의 길이)
		
		map = new boolean[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			
			for(int j=0; j<N; j++) {
				map[i][j] = s.charAt(j) == '1';
			}
		}
		
		ArrayList<Integer> countHouseList = new ArrayList<Integer>(); //단지마다 집 개수 추가
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j] && !visited[i][j]) {
					countHouse = 0; //집 개수 초기화(단지마다 계산)
					dfs(i, j);
					countHouseList.add(countHouse);
				}
			}
		}
		
		System.out.println(countHouseList.size());
		
		Collections.sort(countHouseList); //오름차순 정렬
		
		for(int i : countHouseList) {
			System.out.println(i);
		}

	}

}
