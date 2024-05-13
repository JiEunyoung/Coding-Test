package dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class 백준_1260 {

	static boolean visited[];
	static ArrayList<Integer>[] A; //배열 객체 저장
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //노드 개수
		int M = scanner.nextInt(); //간선 개수
		int Start = scanner.nextInt(); //시작점
		
		A = new ArrayList[N + 1]; //노드는 1번부터 시작(0 인덱스 사용하지 않고 1번 ~ N번까지의 노드 정도 저장)
		
		for(int i=1; i<=N; i++) {
			A[i] = new ArrayList<Integer>(); //연결된 노드 저장
		}
		
		for(int i=0; i<M; i++) {
			int S = scanner.nextInt();
			int E = scanner.nextInt();
			A[S].add(E); //연결되어 있는 노드 표현
			A[E].add(S); //연결되어 있는 노드 표현
		}
		
		//번호 작은 것 먼저 방문하기 위한 정렬
		for(int i=1; i<=N; i++) {
			Collections.sort(A[i]); //ArrayList의 값 정렬
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
			if(!visited[i]) { //방문하지 않은 경우
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
				if(!visited[i]) { //방문하지 않은 경우
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
		
}