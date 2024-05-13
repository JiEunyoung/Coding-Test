package dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class 백준_1260 {

	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //노드 개수
		int M = scanner.nextInt(); //간선 개수
		int Start = scanner.nextInt(); //시작점
		
		A = new ArrayList[N + 1];
		
		for(int i=1; i<=N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			int S = scanner.nextInt();
			int E = scanner.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		
		//번호 작은 것 먼저 방문하기 위한 정렬
		for(int i=1; i<=N; i++) {
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N + 1]; //방문 배열 초기화
		DFS(Start);
		
		System.out.println();
		
		visited = new boolean[N + 1]; //방문 배열 초기화
		BFS(Start);
		
		System.out.println();
	}
	
	public static void DFS(int Node) {
		System.out.println(Node + " ");
		
		visited[Node] = true;
		
		for(int i: A[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node] = true;
		
		while(!queue.isEmpty()) {
			int now_Node = queue.poll();
			System.out.println(now_Node + " ");
			
			for(int i : A[now_Node]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
		
}
