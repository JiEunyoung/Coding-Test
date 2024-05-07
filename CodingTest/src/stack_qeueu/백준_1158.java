package stack_qeueu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class น้มุ_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		System.out.print("<");
		
		while(queue.size() > 1) {
			
			for(int j=1; j<=K-1; j++) {
				int data = queue.peek();
				queue.poll();
				queue.add(data);
			}
			
			int pollData = queue.peek();
			queue.poll();
			System.out.print(pollData + ", ");
				
		}
		
		int pollData = queue.peek();
		queue.poll();
		System.out.print(pollData + ">");
	}

}
