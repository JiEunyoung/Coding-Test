package stack_qeueu;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); //자바에서 제공하는 Queue클래스
		//메소드
		//add(): 삽입(실패 시 exception 발생)
		//offer(): 삽입(실패 시 false 반환)
		//remove(): 앞의 값 삭제(값 존재하지 않으면 false)
		//poll(): 앞의 값 삭제(공백 큐이면 null 반환)
		//element(): 큐 head에 위치한 값 반환(공백 큐이면 exception 발생)
		//peek(): 큐 head에 위치한 값 반환(공백 큐이면 null 반환)
		//clear(): 공백 큐로 초기화
		//size(): 큐 크기
		//contains(): 해당 값이 존재하는지(존재하면 true, 존재하지 않으면 false)
		//isEmpty(): 공백 큐인지 확인(공백 큐이면 true, 공백 큐가 아니면 false)
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("Queue= " + queue); // 1, 2, 3 반환
		
		queue.poll();
		System.out.println("poll한 후 Queue= " + queue); // 2, 3 반환
		
		System.out.println("head에 위치한 값: " + queue.peek()); //2 반환
		
		System.out.println("Queue 크기: " + queue.size()); //2 반환
		
		System.out.println("Queue가 1을 포함하는지: " + queue.contains(1)); //false 반환
		
		System.out.println("Queue가 공백 큐인지: " + queue.isEmpty()); //false 반환
		
		
	}

}
