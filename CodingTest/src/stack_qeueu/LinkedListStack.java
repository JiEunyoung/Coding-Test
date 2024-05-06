package stack_qeueu;

class Node{
	int data;
	Node next; //���� ��带 ����Ű�� ���
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListStack {
	private Node top;
	
	public LinkedListStack() {
		this.top = null;
	}

	public void push(int data) {
		Node node = new Node(data);
		
		if(top == null) {
			top = node;
		} else {
			node.next = top; //������� ���� ��� ���� ��尡 top
			top = node;
		}
	}
	
	public int pop() {
		if(top == null) {
			System.out.println("������ �������.");
			return -1;
		}
		
		int poppedData = top.data;
		top = top.next;
		return poppedData;
	}
	
	public int peek() {
		if(top == null) {
			System.out.println("������ �������");
			return -1;
		}
		
		return top.data;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public int stackSize() {
		int cnt = 0;
		Node currentNode = top;
		while(currentNode != null) {
			cnt++;
			currentNode = currentNode.next;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack(); //���� ����
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("top ��ġ ������: " + stack.peek()); //3 ��ȯ
		
		stack.pop();
		System.out.println("pop()�� �� top ��ġ ������: " + stack.peek()); //2 ��ȯ
		
	}
}
