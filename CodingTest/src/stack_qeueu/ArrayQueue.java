package stack_qeueu;

public class ArrayQueue {

	private int maxSize;
	private int front; //�տ� ��ġ�� ������
	private int rear; //�ڿ� ��ġ�� ������
	private int[] queue;
	private int cnt; //���� ������ ��
	
	public ArrayQueue(int maxSize) {
		this.maxSize = maxSize;
		this.queue = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.cnt = 0;
	}
	
	//���� ť���� Ȯ��
	public boolean queueisEmpty() { 
		return cnt == 0;
	}

	//���� �� ť���� Ȯ��
	public boolean queueisFull() {
		return cnt == maxSize;
	}
	
	public int queueSize() {
		return cnt;
	}
	
	public void add(int data) {
		if(queueisFull()) {
			System.out.println("ť ���� ��");
		}
		rear = (rear + 1) % maxSize;
		queue[rear] = data;
		cnt++; //ť�� ������ ���� 1 ����
	}
	
	public int poll() {
		if(queueisEmpty()) {
			System.out.println("ť �������");
			return -1;
		}
		int pollData = queue[front];
		front = (front + 1) % maxSize;
		cnt--; //ť�� ������ ���� 1 ����
		return pollData;
	}
	
	public int peek() {
		if(queueisEmpty()) {
			System.out.println("ť �������");
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
		queue.printQueue(); //1 2 3 4 5 ��ȯ
		
		queue.poll();
		queue.poll();
		queue.printQueue(); //3 4 5 ��ȯ
		
		System.out.println("�տ� ��ġ�� ��: " + queue.peek()); //3 ��ȯ
		System.out.println("Queue ũ��: " + queue.queueSize()); //3 ��ȯ

	}

}
