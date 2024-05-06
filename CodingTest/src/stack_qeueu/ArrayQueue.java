package stack_qeueu;

public class ArrayQueue {

	private int maxSize;
	private int front; //앞에 위치한 데이터
	private int rear; //뒤에 위치한 데이터
	private int[] queue;
	private int cnt; //현재 데이터 수
	
	public ArrayQueue(int maxSize) {
		this.maxSize = maxSize;
		this.queue = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.cnt = 0;
	}
	
	//공백 큐인지 확인
	public boolean queueisEmpty() { 
		return cnt == 0;
	}

	//가득 찬 큐인지 확인
	public boolean queueisFull() {
		return cnt == maxSize;
	}
	
	public int queueSize() {
		return cnt;
	}
	
	public void add(int data) {
		if(queueisFull()) {
			System.out.println("큐 가득 참");
		}
		rear = (rear + 1) % maxSize;
		queue[rear] = data;
		cnt++; //큐의 데이터 개수 1 증가
	}
	
	public int poll() {
		if(queueisEmpty()) {
			System.out.println("큐 비어있음");
			return -1;
		}
		int pollData = queue[front];
		front = (front + 1) % maxSize;
		cnt--; //큐의 데이터 개수 1 감소
		return pollData;
	}
	
	public int peek() {
		if(queueisEmpty()) {
			System.out.println("큐 비어있음");
			return -1;
		}
		return queue[front];
	}
	
	public void printQueue() {
		int index = front;
		
		for(int i=0; i<=cnt; i++) {
			System.out.print(queue[index] + " ");
			index = (index + 1) % maxSize;
		}
		System.out.println();
	}
	


	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.printQueue(); //1 2 3 4 5 반환
		
		queue.poll();
		queue.poll();
		queue.printQueue(); //3 4 5 반환
		
		System.out.println("앞에 위치한 값: " + queue.peek()); //3 반환
		System.out.println("Queue 크기: " + queue.queueSize()); //3 반환

	}

}
