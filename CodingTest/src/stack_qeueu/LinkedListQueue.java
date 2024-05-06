package stack_qeueu;

public class LinkedListQueue {
	private Node front; //ť�� �տ� ��ġ�� ���
	private Node rear; //ť�� �ڿ� ��ġ�� ���
	
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
			System.out.println("ť�� �������");
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
			System.out.println("ť�� �������");
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
		
		System.out.println("front ��ġ ������: " + queue.peek()); //1 ��ȯ
		
		queue.poll();
		System.out.println("pop()�� �� front ��ġ ������: " + queue.peek()); //2 ��ȯ
		

	}

}
