package dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ����_1260 {

	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //��� ����
		int M = scanner.nextInt(); //���� ����
		int Start = scanner.nextInt(); //������
		
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
		
		//��ȣ ���� �� ���� �湮�ϱ� ���� ����
		for(int i=1; i<=N; i++) {
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N + 1]; //�湮 �迭 �ʱ�ȭ
		DFS(Start);
		
		System.out.println();
		
		visited = new boolean[N + 1]; //�湮 �迭 �ʱ�ȭ
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
