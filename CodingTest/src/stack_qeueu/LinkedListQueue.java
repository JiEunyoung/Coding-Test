package stack_qeueu;

public class LinkedListQueue {
	private Node front; //큐의 앞에 위치한 노드
	private Node rear; //큐의 뒤에 위치한 노드
	
	public LinkedListQueue() {
		this.front = null;
		this.rear = null;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			front = rear = node;
		}else {
			rear.next = node;
			rear = node;
		}
	}
	
	public int poll() {
		if(isEmpty()) {
			System.out.println("큐는 비어있음");
			return -1;
		}
		
		int pollData = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		
		return pollData;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("큐는 비어있음");
			return -1;
		}
		return front.data;
	}

	public boolean isEmpty() {
		return front == null;
	}


	public static void main(String[] args) {
		LinkedListQueue queue = new LinkedListQueue();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println("front 위치 데이터: " + queue.peek()); //1 반환
		
		queue.poll();
		System.out.println("pop()한 후 front 위치 데이터: " + queue.peek()); //2 반환
		

	}

}
